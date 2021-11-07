import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcImplement extends UnicastRemoteObject implements CalcInterface {

    public CalcImplement() throws RemoteException {
        super();
    }

    @Override
    public int count(String str) throws RemoteException {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }

    @Override
    public String reverse(String str) throws RemoteException {
        StringBuilder SB = new StringBuilder(str);
        return SB.reverse().toString();
    }

}
