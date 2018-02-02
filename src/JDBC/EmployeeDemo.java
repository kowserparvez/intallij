package JDBC;

import java.sql.*;

public class EmployeeDemo {

    public static void main(String[] args) {
        try{

            String url ="jdbc:mysql://localhost:3306/demo";
            String user = "root";
            String password = "taheem12";
            //1.	Get a connection to database
            Connection myConn = DriverManager.getConnection(url,user,password);

            System.out.println("Connected To The DB");

            //2.	Create a statement object
            Statement myStmt = myConn.createStatement();

             //3.	Execute SQL query
            String sql= "select * from employees";
            ResultSet myRs = myStmt.executeQuery(sql);

        //4.	Process Result Set
        while(myRs.next()){
            String columnLabel1="id";
            String columnLabel2="name";
            String columnLabel3="email";
            String columnLabel4="age";


            System.out.println(myRs.getString(columnLabel1)+","+
                    myRs.getString(columnLabel2)+ ","+ myRs.getString(columnLabel3)
                            +","+ myRs.getString(columnLabel4));
        }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
