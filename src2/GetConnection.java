import java.sql.*;


/**
 * Created by shixiliufang on 6/12/16.
 */
public class GetConnection {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("MySQL driver loaded");
        }catch(ClassNotFoundException e1){
            System.out.println("Cannot find MySQL driver");
            e1.printStackTrace();
        }

        String url="jdbc:mysql://localhost:3306/test";
        Connection conn;
        try {
            conn = DriverManager.getConnection(url,"root","toor");
            Statement stmt = conn.createStatement();
            System.out.print("Connected");
            stmt.close();
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
