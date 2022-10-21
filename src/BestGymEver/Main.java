package BestGymEver;

import javax.swing.*;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        String inputFile = "src/BestGymEver/Personuppgifter.txt";
        String outputFile = "src/BestGymEver/filTillPt.txt";

        List<Person> personLista = Gym.readFromFile(inputFile);
        List<Person> medlemSkapsLista = GiltigtMedlemskap.medlemskapsLista(personLista);

            String svar = JOptionPane.showInputDialog("Ange namn eller personnummer;");

            if (SökPerson.register(svar, personLista)) {
                SökPerson.medlem(svar, medlemSkapsLista);
                Gym.writeToFile(medlemSkapsLista, svar, outputFile);
            }
    }
}