package ornek12;

import java.util.HashMap;

public class Ornek12 {

    public static void main(String[] args) {
        // HashMap çalışma
        HashMap<String, String> sozluk = new HashMap<String, String>();

        sozluk.put("Book", "Kitap");
        sozluk.put("Table", "Masa");
        sozluk.put("Ladder", "Merdiven");
        sozluk.put("Computer", "Bilgisayar");

        System.out.println(sozluk.size());

        System.out.println(sozluk);
        System.out.println(sozluk.get("Table"));

        for (String soz : sozluk.keySet()) { // keySet() liste olarak (sırası farklı şekilde gelir) verir
            System.out.println("Eleman:" + soz +" Değer:"+ sozluk.get(soz));
        }

        sozluk.remove("Table");
        sozluk.clear();

        System.out.println(sozluk.size());

    }

}
