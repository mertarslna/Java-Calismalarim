package ornek8;

public class Ornek8 {

    public static void main(String[] args) {
        // Compositon örnek çalışma
        ProductManager pm = new ProductManager();
        Product p = new Product(10000,"laptop");
        pm.add(p);
    }

}

class ProductValidator {

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

class ProductManager {

    void add(Product product) {
        if (ProductValidator.isValid(product)) {
            System.out.println("Ürün eklendi");
        } else {
            System.out.println("Geçersiz ürün girişi yapıldı");
        }
    }

}

class Product {

    int price;
    String name;

    Product(int price, String name) {
        this.price = price;
        this.name = name;
    }

}
