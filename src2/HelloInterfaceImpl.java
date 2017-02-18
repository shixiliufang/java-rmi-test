import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by shixiliufang on 6/11/16.
 */
public class HelloInterfaceImpl extends UnicastRemoteObject implements HelloInterface {
    private String message;

    public HelloInterfaceImpl(String message) throws RemoteException {
        this.message = message;
    }

    public String say() throws RemoteException {
        System.out.println("Java RMI");
        return message;
    }
}
