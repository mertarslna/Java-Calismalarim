package ornek22;

import java.sql.*;
import java.util.ArrayList;

public class Ornek22 {

    public static void main(String[] args) throws SQLException {
        // Databaseden çekilen verileri nesne arraylistine atma
        
        ArrayList list = new ArrayList();

        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from sakila.actor");
            ArrayList<Actor> actors = new ArrayList<Actor>();

            while (resultSet.next()) {
                actors.add(new Actor(
                        resultSet.getString("actor_id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("last_update")));
            }

            System.out.println(actors.size());
        } catch (SQLException e) {
            e.printStackTrace();
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
