package ornek14;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ornek14 {

    public static void main(String[] args) throws IOException {
        // Dosya İşlemleri Çalışma
        createFile();
        System.out.println("");

        getFileInfo();
        System.out.println("");

        readFile();
        System.out.println("");

        writeFile();
        System.out.println("");

        readFile();
        System.out.println("");

        overWriteFile();
        System.out.println("");
    }

    public static void createFile() {
        File file = new File("C:\\Users\\Merta\\OneDrive\\Desktop\\deneme.txt"); // masaüstü yolu
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu.");
            } else {
                System.out.println("Dosya zaten mevcut.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\Users\\Merta\\OneDrive\\Desktop\\deneme.txt");
        if (file.exists()) {
            System.out.println("Dosya adı: " + file.getName()); // dosya adını okuma
            System.out.println("Dosya yolu: " + file.getAbsolutePath()); // dosya yolunu okuma
            System.out.println("Dosya yazılabilir mi: " + file.canWrite()); // dosya yazılabilir mi
            System.out.println("Dosya okunabilir mi: " + file.canRead()); // dosya okunabilir mi
            System.out.println("Dosya boyutu: " + file.length() + " bayt");
        }
    }

    public static void readFile() {
        File file = new File("C:\\Users\\Merta\\OneDrive\\Desktop\\deneme.txt");
        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
            }
            scan.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeFile() { // dosya içeriğini silerek içine yazar
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Merta\\OneDrive\\Desktop\\deneme.txt"));
            writer.write("Ahmet");
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void overWriteFile() { // dosya içeriğinin üzerine yazar
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Merta\\OneDrive\\Desktop\\deneme.txt", true)); // append üzerine yazmayı açar
            writer.newLine();
            writer.write("Ahmet");
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
