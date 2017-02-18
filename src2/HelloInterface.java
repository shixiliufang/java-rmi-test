/**
 * Created by shixiliufang on 6/11/16.
 */
import java.rmi.*;
public interface HelloInterface extends Remote {
    public String say() throws RemoteException;
}
