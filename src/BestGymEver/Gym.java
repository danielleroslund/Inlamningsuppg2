package BestGymEver;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gym {

    public static List<Person> readFromFile(String inFile){
        String firstrow;
        String secondrow;

        Path inFil;
        List<Person> personLista = new ArrayList<>();

        String [] personDataFirstrow;
        String [] personDataSecondRow = new String[1];

        inFil = Paths.get(inFile);

        // try-with-resources
        try(Scanner fileScanner = new Scanner(inFil)){

            while(fileScanner.hasNext()){

                firstrow = fileScanner.nextLine();
                personDataFirstrow = firstrow.split(",");

                if(fileScanner.hasNext()){
                    secondrow = fileScanner.nextLine();
                    personDataSecondRow = secondrow.split(",");
                }
                Person p = new Person(personDataFirstrow[0].trim(), personDataFirstrow[1].trim(), personDataSecondRow[0].trim());
                personLista.add(p);

            }
        }
        catch (IOException e){
            System.out.println("Filen kan inte hittas");
            e.printStackTrace();
        }
        return personLista;
    }

    public static void writeToFile(List<Person> inträdesLista, String svar, String fil) throws IOException{

        try(BufferedWriter w = new BufferedWriter(new FileWriter(String.valueOf(fil),true))){
            for(Person p : inträdesLista){

                // Parsa datum
                LocalDate ld = LocalDate.parse(p.getDatum());

                if(svar.equalsIgnoreCase(p.getNamn()) && ld.isAfter(LocalDate.now().minusYears(1)) || svar.equals(p.getPersonnummer()) && ld.isAfter(LocalDate.now().minusYears(1))){
                    w.write(p.toString());
                    System.out.println("och läggs nu till i PT-filen.");


                }
            }

        }
        catch (FileNotFoundException e){
            System.out.println("Filen kan inte hittas");
            e.printStackTrace();
            System.exit(0);
        }
        catch (IOException e){
            System.out.println("Det går inte att skriva till filen");
            e.printStackTrace();
            System.exit(0);
        }
        catch (Exception e){
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.exit(0);
        }

    }
}
