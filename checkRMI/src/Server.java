import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
            Naming.rebind("rmi://localhost:1200/Calc", new CalcImplement());
            System.out.println("Server is ready !!!");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
