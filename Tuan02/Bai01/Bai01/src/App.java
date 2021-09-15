import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String inputString = sc.nextLine();
        System.out.println("Your output: " + inputString.toUpperCase());        

    }
}
