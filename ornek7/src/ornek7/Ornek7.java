package ornek7;

public class Ornek7 {

    public static void main(String[] args) {
        // veri tabanına kayıt (genel geçer) abstract pekiştirme
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new SqlDatabaseManager();
        customerManager.getCustomers();
    }

}

abstract class BaseDatabaseManager {

    public abstract void getData();
}

class OracleDatabaseManager extends BaseDatabaseManager {

    public void getData() {
        System.out.println("Veri getirildi: Oracle");
    }
}

class SqlDatabaseManager extends BaseDatabaseManager {

    public void getData() {
        System.out.println("Veri getirildi: SQL Server");
    }
}
class MySqlDatabaseManager extends BaseDatabaseManager {

    public void getData() {
        System.out.println("Veri getirildi: My Sql");
    }
}

class CustomerManager {
    BaseDatabaseManager databaseManager;
    public void getCustomers() {
         databaseManager.getData();
    }
}
