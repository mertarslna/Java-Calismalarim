package ornek21;

import java.sql.*;

public class Ornek21 {

    public static void main(String[] args) throws SQLException {
        // Databaseden veri çekme çalışması
        
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from sakila.actor");

            while (resultSet.next()) {
                System.out.print("Aktör: ");
                System.out.print(resultSet.getString("first_name"));
                System.out.print(" ");
                System.out.println(resultSet.getString("last_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

}

class DbHelper {

    private String user = "root";
    private String password = "12345";
    private String url = "jdbc:mysql://localhost:3306/mysql";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
