import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.print("Input: ");
        String inputString = sc.nextLine();
        System.out.println("Your output: " + inputString.toUpperCase());       

    }
}
