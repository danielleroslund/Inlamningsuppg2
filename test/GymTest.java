import BestGymEver.Gym;
import BestGymEver.Person;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class GymTest {

    String inputFile = "test/personuppgifterTest.txt";
    Gym gym = new Gym();
    String outputFile = "test/filTillPtTest.txt";


    @Test // kontrollerar inläsning
    public final void readFromFile(){
        List<Person> personLista = gym.readFromFile(inputFile);

        assert(personLista.size() == 14);
        assert(personLista.size() != 11);
    }

    @Test
    void writeToFile() throws IOException{



        String sök = "Alhambra Aromes";

        Person p1 = new Person("7703021234", "Alhambra Aromes", "2022-07-01");
        Person p2 = new Person("7608021234", "Diamanda Djedi","2022-01-30");
        List<Person> testPersonLitsa = Arrays.asList(p1,p2);

        // Test för att se om utskrift görs till filen
        gym.writeToFile(testPersonLitsa, sök, outputFile);




    }


}
