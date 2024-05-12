package ornek4;

import java.util.Scanner;

public class Ornek4 {

    public static void main(String[] args) {
        // Mükemmel sayı bulma
        // 6 ---> 1,2,3 e bölünür ve 1+2+3 = 6
        // 28 ---> 1,2,4,7,14 e bölünür ve 1+2+4+7+14 = 28
        Scanner s = new Scanner(System.in);
         
        System.out.print("Sayiyi giriniz: ");
        int number = s.nextInt();
        int total = 0;
        
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total+= i;
            }
        }
        if(total==number){
            System.out.println(number + " mükemmel sayıdır.");
        }
        else{
            System.out.println(number + " mükemmel sayı değildir.");
        }
    }
    
}
