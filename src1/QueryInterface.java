import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by shixiliufang on 6/12/16.
 */
public interface QueryInterface extends Remote {
    public String Query1(int id) throws RemoteException;
}
