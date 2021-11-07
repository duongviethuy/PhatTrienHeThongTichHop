
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            CalcInterface calc = (CalcInterface) Naming.lookup("rmi://localhost:1200/Calc");
            BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
            do {
                System.out.print("Input: ");
                String str = BR.readLine();
                if (BR.toString().equals("exit")) {
                    Naming.unbind("rmi://localhost:1200/Calc");
                    break;
                }
                System.out.println("Chuoi sau dao nguoc: " + calc.reverse(str));
                System.out.println("So luong tu : " + calc.count(str));
            } while (true);

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
