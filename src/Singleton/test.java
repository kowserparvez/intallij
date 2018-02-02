package Singleton;

public class test {
    public static void main(String[] args) {
        DatabaseLicense databaseLicense = DatabaseLicense.getInstance();
        databaseLicense.databaseConnection();
    }
}
