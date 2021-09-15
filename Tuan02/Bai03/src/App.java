import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Chương trình giải phương trình bậc hai: ");  
        System.out.print("a = ");
        float a = sc.nextFloat();
        System.out.print("b = ");
        float b = sc.nextFloat();        
        System.out.print("c = ");
        float c = sc.nextFloat();        
        float x1, x2;
        if (a == 0.0) {
            if(b == 0.0) 
                System.out.println("Phương trình vô nghiệm");
            else System.out.println("Phương trình có nghiệm: x=" + (float)-c/b);;
        } else {
            float delta = b*b - 4*a*c;  
            if(delta>0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                System.out.println("Phương trình có nghiệm 2 phân biệt: \nx1= " + (float)x1+ "\nx2 = " + (float)x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("Phương trình có nghiệm kép: \nx="+(float)x1);
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } 
    }
}
    

       
    

