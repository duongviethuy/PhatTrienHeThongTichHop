import java.util.Scanner;
public class App {
    public static Scanner sc = new Scanner(System.in);    
    public static void main(String[] args) throws Exception {
        System.out.println("Program check Prime Number");
        System.out.print("Input number that you need to check: ");
        int checkPrNum = sc.nextInt();
        int count = 1;
        for(int i=1; i<checkPrNum; i++) 
            if(checkPrNum % i == 0 ) 
                count ++;
        if (count>2) {
            System.out.println("It isn't a Prime Number");
        } else System.out.println("It is a Prime Number");
    }
}
