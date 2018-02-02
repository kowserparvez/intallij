package JDBC;
import java.sql.*;
public class PrepStat {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String password = "taheem12";
        PreparedStatement myStmt = null;
        ResultSet myRs = null;
        Connection myConn=null;

        try {
            myConn = DriverManager.getConnection(url, user, password);
            String sql = "select * from employees "
                    + "where id >? and age<?";

            myStmt = myConn.prepareStatement(sql);
            myStmt.setInt(1, 0);
            myStmt.setInt(2, 20);
            myRs = myStmt.executeQuery();

            while (myRs.next()) {
                String columnLabel1 = "id";
                String columnLabel2 = "name";
                String columnLabel3 = "email";
                String columnLabel4 = "age";

                System.out.println(myRs.getString(columnLabel1) + "," +
                        myRs.getString(columnLabel2) + "," + myRs.getString(columnLabel3)
                        + "," + myRs.getString(columnLabel4));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }finally{
            if (myRs!= null){
                myRs.close();
            }
            if(myStmt!=null){
                myStmt.close();
            }
            if (myConn!=null){
                myConn.close();
            }
        }
    }
}