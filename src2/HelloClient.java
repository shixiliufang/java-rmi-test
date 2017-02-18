import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by shixiliufang on 6/11/16.
 */
public class HelloClient {
    public static void main(String[] args) {
        try{
            HelloInterface hello = (HelloInterface) Naming.lookup("hello");
            System.out.println(hello.say());
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
