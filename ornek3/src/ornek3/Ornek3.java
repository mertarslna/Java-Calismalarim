package ornek3;

import java.util.Scanner;

public class Ornek3 {

    public static void main(String[] args) {
        // klavyeden girilen tamsayı asal mı?
        Scanner s = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int sayi = s.nextInt();
        Boolean sonuc = true; // başlangıçta asal kabul ettim

        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                sonuc = false;
                break;
            }
        }

        if (sonuc) {
            System.out.println(sayi + " asaldır.");
        } else {
            System.out.println(sayi + " asal değildir.");
        }

    }

}
