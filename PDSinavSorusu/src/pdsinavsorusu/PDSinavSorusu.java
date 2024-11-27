package pdsinavsorusu;

public class PDSinavSorusu {

    static boolean tanirMi(String girdi) {
        
        char harf = girdi.charAt(0);
        if (!((harf >= 'a' && harf <= 'z') || (harf >= 'A' && harf <= 'Z') || harf == '_')) 
            return false;

        for (int i = 1; i < girdi.length(); i++) {
            harf = girdi.charAt(i);
            if (!((harf >= 'a' && harf <= 'z') || (harf >= 'A' && harf <= 'Z') || (harf >= '0' && harf <= '9') || harf == '_')) 
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(tanirMi("_ayakkabi"));
        System.out.println(tanirMi("1degisken")); 
        System.out.println(tanirMi("degisken@")); 
        System.out.println(tanirMi("degisken1"));
        System.out.println(tanirMi("*ayakkabi"));
        System.out.println(tanirMi("memo***"));


    }
}
