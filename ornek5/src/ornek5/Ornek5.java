package ornek5;

public class Ornek5 {

    public static void main(String[] args) {
        // class kullanarak basit hesap makinesi yapımı
        Calculator c = new Calculator();
        System.out.println(c.Add(5,6));

    }

}

class Calculator {

    public int Add(int num1, int num2) {
        return num1 + num2;
    }

    public int Sub(int num1, int num2) {
        return num1 - num2;
    }

    public int Div(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public int Mul(int num1, int num2) {
        return num1 * num2;
    }
}
