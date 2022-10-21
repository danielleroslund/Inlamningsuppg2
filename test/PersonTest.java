import BestGymEver.Person;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertEquals;

public class PersonTest {
    Person p = new Person("7703021234", "Alhambra Aromes", "2022-07-01");

    @Test
    public final void getPersonnummerTest(){

        assertEquals("7703021234", p.getPersonnummer());
        assertNotEquals("8204021234", p.getPersonnummer());
    }

    @Test
    public final void getNamnTest(){
        assertEquals("Alhambra Aromes", p.getNamn());
        assertNotEquals("Bear Belle", p.getNamn());
    }

    @Test
    public final void getDatumTest(){
        assertEquals("2022-07-01", p.getDatum());
        assertNotEquals("2019-12-02", p.getDatum());
    }

}
