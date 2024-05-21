package Ornek19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ornek19 {

    public static void main(String[] args) {
        // MySql database bağlanma 

        String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "root";
        String password = "12345";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC sürücüsünü yükleyin

            Connection connection = DriverManager.getConnection(url, user, password); // Bağlantıyı kurar
            System.out.println("Bağlantı başarılı!");

            connection.close(); // Bağlantıyı kapatır
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
