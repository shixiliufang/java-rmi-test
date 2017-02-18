import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by shixiliufang on 6/12/16.
 */
public class QueryImplement extends UnicastRemoteObject implements QueryInterface {
    public QueryImplement() throws RemoteException{
    }

    public String Query1(int id) throws RemoteException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test";
            Connection conn;
            conn = DriverManager.getConnection(url, "root", "toor");
            Statement stmt = conn.createStatement();
            String sql = "select name from student where id = " + id + ";";
            ResultSet rs = stmt.executeQuery(sql);
            String result;
            /* System.out.println("ID" + "\t" + "Name");
            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.println();
            } */
            if(rs.next()) {
                result = rs.getString(1);
            }
            else{
                result = "No match";
            }
            rs.close();
            stmt.close();
            conn.close();
            return result;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    return "No Match";
    }
}
