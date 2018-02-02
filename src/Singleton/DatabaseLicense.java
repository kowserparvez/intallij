package Singleton;

public class DatabaseLicense {
    private static DatabaseLicense instance = new DatabaseLicense();
    //instance is a referance veriable
    private DatabaseLicense(){

    }
    public static DatabaseLicense getInstance(){
        //DatabaseLicense is type
        return instance;

    }
    public void databaseConnection(){
        System.out.println("One connection only!!!!");
    }

}
