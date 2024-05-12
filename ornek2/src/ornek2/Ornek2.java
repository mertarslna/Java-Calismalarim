package ornek2;

public class Ornek2 {

    public static void main(String[] args) {
        // Recap demo arrays
        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            System.out.println(i+1 + ". Eleman: " + myList[i]);
            total += myList[i];
            if (max < myList[i]) {
                max = myList[i];
            }
        }
        System.out.println("Toplam: " + total);
        System.out.println("En büyük sayı: " + max);
    }

}
