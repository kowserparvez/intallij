package JDBC;
import java.sql.*;
public class DeletingData {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String password = "taheem12";

        try{
            Connection myConn = DriverManager.getConnection(url,user,password);

            Statement myStmt = myConn.createStatement();

//            String sql = "insert into employees"
//                    + "(id, name, email, age)"
//                    +"values(4, 'Maria', 'maria@gmail.com', 22)";
//            myStmt.executeUpdate(sql);
//            System.out.println("insertion complete");
            String sql = "delete from employees where id =4";
            myStmt.executeUpdate(sql);

            System.out.println("Data Deleted");


        }catch(Exception e){
            e.printStackTrace();

        }






























    }
}
