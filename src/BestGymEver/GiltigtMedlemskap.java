package BestGymEver;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GiltigtMedlemskap {

    public static List<Person> medlemskapsLista(List<Person> allaPersoner){

        List<Person> medlemskapsLista = new ArrayList<>();

        //LocalDate.parse
        for(Person p: allaPersoner){
            LocalDate ld = LocalDate.parse(p.getDatum());
            if(ld.isAfter(LocalDate.now().minusYears(1))) {
                medlemskapsLista.add(p);
            }

        }
        return medlemskapsLista;

    }

}
