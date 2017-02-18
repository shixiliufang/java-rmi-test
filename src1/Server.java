import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by shixiliufang on 6/12/16.
 */
public class Server {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            QueryInterface query = new QueryImplement();
            Naming.rebind("query", query);
            System.out.println("Server is ready.");
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
