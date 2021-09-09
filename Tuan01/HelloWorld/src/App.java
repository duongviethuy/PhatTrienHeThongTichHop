import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class App {
    public static void main(String[] args) {
        InputStream istr = System.in;
        OutputStream ostr = System.out;        
        while (true) {
            System.out.println("Input your age: ");
            try {
                int age = istr.read();
                if( age < 18 ) System.out.println("You aren't enough 18 ages");
                
                else ostr.write(age);                    
        } catch (IOException ioe) {
                System.out.println(ioe);
            }
        }
        
    }
}
