import BestGymEver.GiltigtMedlemskap;
import BestGymEver.Person;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class GiltigtMedlemskapTest {

    GiltigtMedlemskap gm = new GiltigtMedlemskap();

    LocalDate ld = LocalDate.now().minusMonths(5);
    LocalDate ld2 = LocalDate.now().minusYears(2);
    LocalDate ld3 = LocalDate.now().minusDays(90);

    Person p1 = new Person("7703021234", "Alhambra Aromes", ld.toString());
    Person p2 = new Person("8204021234", "Bear Belle",ld2.toString());
    Person p3 = new Person("7608021234", "Diamanda Djedi",ld3.toString());

    List<Person> giltig = new ArrayList<>();
    List<Person> testpers = new ArrayList<>();

    @Test
    public final void giltigMedlemskapListaTest(){
        testpers = Arrays.asList(p1,p2,p3);
        giltig = GiltigtMedlemskap.medlemskapsLista(testpers);

        assertTrue(giltig.size() == 2);
        assertFalse(giltig.size() == 1);
    }



}
