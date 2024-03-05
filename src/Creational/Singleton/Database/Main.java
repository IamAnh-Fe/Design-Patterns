package Creational.Singleton.Database;

public class Main {
    public static void main(String args[]) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();

        db1.getConnection();
        db2.getConnection();

    }
}
