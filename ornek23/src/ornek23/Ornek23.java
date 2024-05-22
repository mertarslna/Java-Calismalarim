package ornek23;

import java.sql.*;
import java.util.ArrayList;

public class Ornek23 {

    public static void main(String[] args) throws SQLException {
        // Database kayıt ekleme

        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            // statement = connection.prepareStatement("insert into sakila.actor (first_name, last_name, last_update) values ('MERT', 'ARSLAN', '2023-02-15 09:34:33')");
            // statement.executeUpdate();

            statement = connection.prepareStatement("insert into sakila.actor (first_name, last_name, last_update) values (?,?,?)");
            statement.setString(1, "MERT");
            statement.setString(2, "ARSLAN");
            statement.setString(3, "2024-05-22 09:35:00");
            statement.executeUpdate();

            System.out.println("Kayıt eklendi!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            statement.close();
            connection.close();
        }
    }
}

class DbHelper {

    private String user = "root";
    private String password = "12345";
    private String url = "jdbc:mysql://localhost:3306/mysql";

    Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}

class Actor {

    private String actor_id;
    private String first_name;
    private String last_name;
    private String last_update;

    public Actor(String actor_id, String first_name, String last_name, String last_update) {

        this.actor_id = actor_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.last_update = last_update;

    }
}
