import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by shixiliufang on 6/11/16.
 */
public class HelloServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            HelloInterface hello = new HelloInterfaceImpl("hello, world!");
            Naming.rebind("hello", hello);
            System.out.println("rmi server is ready!");
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
