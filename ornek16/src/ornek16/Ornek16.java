package ornek16;

public class Ornek16 {

    public static void main(String[] args) {
        // Generic metotları çalışma
        Validator validator = new Validator();
        Customer customer = new Customer();
        validator.validate(customer);
    }

}

class Validator {

    public <T> void validate(T entity) {
        
    }
}
class Customer {
    
}