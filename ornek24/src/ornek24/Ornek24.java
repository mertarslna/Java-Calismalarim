package ornek24;

import java.sql.*;

public class Ornek24 {

    public static void main(String[] args) throws SQLException {
        // MySql Database update işlemi

        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            // statement = connection.prepareStatement("update sakila.actor set first_name = 'MERT',last_name = 'ARSLAN' where actor_id = '204'");
            statement = connection.prepareStatement("update sakila.actor set first_name = 'MERT',last_name = 'ARSLAN' where actor_id = ? ");
            statement.setString(1, "1");
            statement.executeUpdate();

            System.out.println("Kayıt güncellendi!");
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            connection.close();
            statement.close();
        }
    }
}

class DbHelper {

    private String url = "jdbc:mysql://localhost:3306/mysql";
    private String user = "root";
    private String password = "12345";

    Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    void showErrorMessage(SQLException e) {
        System.out.println("Error: " + e.getMessage());
        System.out.println("Error code: " + e.getErrorCode());

    }
}
