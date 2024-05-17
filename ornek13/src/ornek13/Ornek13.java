package ornek13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ornek13 {

    public static void main(String[] args) throws IOException { // throws FileNotFoundException
        // try catch finally ve throws exception çalışma
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("sayilar.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }

}
