package ornek9;

import java.util.ArrayList;

public class Ornek9 {

    public static void main(String[] args) {
        // ArrayList çalışma

        ArrayList numbers = new ArrayList(); // import gerekli

        numbers.add(1); // ekleme
        numbers.add(10);
        numbers.add("Ankara");

        for (Object number : numbers) {
            System.out.println(number);
        }

        numbers.set(0, 100);    // değiştirme
        numbers.remove(2);  // silme
        // numbers.clear();    // tümünü silme
        // numbers.set(3,100);    

        for (Object number : numbers) {
            System.out.println(number);
        }
    }

}
