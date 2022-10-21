import BestGymEver.Person;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertEquals;

public class SökPersonTest {

    String svar = "Alhambra Aromes";
    List<Person> personList = new ArrayList<>();
    List<Person> medlemsskapsLista = new ArrayList<>();

    Person p1 = new Person("7703021234", "Alhambra Aromes", "2022-07-01");
    Person p2 = new Person("8204021234", "Bear Belle"," 2019-12-02");

    @Test
    void register(){

        personList.add(p1);
        personList.add(p2);

        boolean hittad = false;
        for(Person p: personList){
            if(svar.equalsIgnoreCase(p.getNamn()) || svar.equals(p.getPersonnummer())){
                hittad = true;
            }
        }

        assertEquals(hittad, true); //personen finns, print
        assertNotEquals(hittad, false); // personen finns inte, print

    }

    @Test
    void medlem(){
        medlemsskapsLista.add(p1);
        medlemsskapsLista.add(p2);

        boolean hittad = false;
        for(Person p :  medlemsskapsLista){
            if(svar.equalsIgnoreCase(p.getNamn()) || svar.equals(p.getPersonnummer())){
                hittad = true; // Hittad är sant, meddela att personen är medlem
                break;
            }
        }
        assertEquals(hittad, true); // printa ut att personen ÄR medlem
        assertNotEquals(hittad, false); // printa ut att personen INTE är medlem
    }
}
