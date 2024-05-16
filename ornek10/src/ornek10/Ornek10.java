package ornek10;

import java.util.ArrayList;
import java.util.Collections;

public class Ornek10 {

    public static void main(String[] args) {
        // Generics çalışma
        ArrayList<String> cities = new ArrayList<String>();

        cities.add("Elazığ");
        cities.add("İstanbul");
        cities.add("Sivas");
        cities.add("Antalya");
        cities.add("Ankara");

        cities.remove("İstanbul");
        Collections.sort(cities); // Alfabetik olarak sıralar

        for (String city : cities) {
            System.out.println(city);
        }
    }

}
