package ornek11;

import java.util.ArrayList;

public class Ornek11 {

    public static void main(String[] args) {
        // Classlar ile ArrayList kullanımı çalışma
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer mert = new Customer(1, "Mert", "Arslan");
        customers.add(mert);

        customers.add(new Customer(2, "Ali", "Yılmaz"));
        customers.add(new Customer(3, "Hasan", "Demiroğ"));
        
        customers.remove(new Customer(1, "Mert", "Arslan")); // silmez
        customers.remove(mert);

        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }
    }

}

class Customer {

    int id;
    String firstName;
    String lastName;

    public Customer() {

    }

    public Customer(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
