package BestGymEver;

import java.time.LocalDate;

public class Person {

    String personnummer;
    String namn;
    String datum;

    public Person(String personnummer, String namn, String datum) {
        this.personnummer = personnummer;
        this.namn = namn;
        this.datum = datum;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public String getNamn() {
        return namn;
    }

    public String getDatum() {
        return datum;
    }

    public String toString(){
        return "Personnummer: " + getPersonnummer() + ", " + " Namn: " + getNamn() + ", " + "\n"
                + "Datum för inträde " + LocalDate.now() + ", " + "\n";
    }

}
