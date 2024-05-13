package ornek6;

public class Ornek6 {
    // çalışan müşteri ilişkisi inheritance(miras)
    public static void main(String[] args) {
        Person customer = new Customer();
        Person Employee = new Customer();
        PersonManager employeeManager = new EmployeeManager();
        PersonManager customerManager = new CustomerManager();
    }

}

class Person {

    int id;
    String firstName;
    String lastName;
    int age;
}

class PersonManager {

    public void List() {
        System.out.println("Listelendi");
    }

    public void Add() {
        System.out.println("Eklendi");
    }

}

class Customer extends Person {

    String email;

}

class CustomerManager extends PersonManager {
}

class Employee extends Person {

    double salary;
}

class EmployeeManager extends PersonManager {

    public void BestEmployee() {
        System.out.println("Ayın elemanı getirildi");
    }

}
