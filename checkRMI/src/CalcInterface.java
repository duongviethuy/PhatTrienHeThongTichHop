import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalcInterface extends Remote {
    public int count(String str) throws RemoteException;

    public String reverse(String str) throws RemoteException;
}
