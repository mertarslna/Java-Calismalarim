package ornek20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ornek20 {

    public static void main(String[] args) throws SQLException {
        // Db çalışma + DbHelper
        
        Connection connection = null;
        DbHelper helper = new DbHelper();
        try {
            connection = helper.getConnection();
            System.out.println("Bağlantı başarılı!");
        } catch (SQLException e) {
            helper.error(e);
        } finally {
            connection.close();
        }
    }
}

class DbHelper {

    private String url = "jdbc:mysql://localhost:3306/mysql";
    private String user = "root";
    private String password = "12345";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public void error(SQLException e) {
        System.out.println("Error: " + e.getMessage());
        System.out.println("Error code: " + e.getErrorCode());
    }
}
