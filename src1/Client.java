import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 * Created by shixiliufang on 6/12/16.
 */
public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            QueryInterface query = (QueryInterface) Naming.lookup("query");
            int t;
            while (true) {
                t = sc.nextInt();
                System.out.println("ID" + "\t" + "Name");
                System.out.print(t + "\t");
                System.out.print(query.Query1(t));

                System.out.println();
            }
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
        catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
