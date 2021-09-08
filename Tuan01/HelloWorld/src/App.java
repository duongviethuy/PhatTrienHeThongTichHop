import java.util.Scanner;

public class App {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int age;
        String name;
        System.out.println("Hello, World!");
        System.out.println("Input your name: ");
        name = sc.nextLine();
        System.out.println("Input you age: ");
        age = sc.nextInt();
        if (age < 18)
            System.out.println("Sorry you don't grow enough");
        else
            System.out.println("Hello " + name);
    }
}
