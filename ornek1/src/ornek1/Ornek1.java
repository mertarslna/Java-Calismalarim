package ornek1;

import java.util.Scanner;

public class Ornek1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = s.nextInt();
        
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = s.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        int sayi3 = s.nextInt();
        
        int max = sayi1;
        
        if (sayi2>max) {
            max=sayi2;
        }
        if (sayi3>max) {
            max=sayi3;
        }
        
        System.out.println("En büyük sayı: "+max);
    }
    
}
