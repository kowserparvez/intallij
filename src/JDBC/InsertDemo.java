package JDBC;
import java.sql.*;

public class InsertDemo {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String password = "taheem12";

        try{
            Connection myConn = DriverManager.getConnection(url,user,password);

            Statement myStmt = myConn.createStatement();

            String sql = "insert into employees"
                    + "(id, name, email, age)"
                    +"values(6, 'John', 'John@gmail.com', 29)";
            myStmt.executeUpdate(sql);
            System.out.println("insertion complete");



            }catch(Exception e){
            e.printStackTrace();

        }






























    }
}
