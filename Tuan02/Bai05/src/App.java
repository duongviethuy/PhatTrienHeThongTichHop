import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)  {
        System.out.println("Chương trình tính tổng dãy số thực");
        System.out.print("Dãy có bao nhiêu số: ");
        int n = sc.nextInt();
        float [] A = new float[n];
        float total =0;
        for(int i=0; i<n; ++i) {
            System.out.print("Số thứ " + (int)(i+1) + ": ");
            A[i] = (float) sc.nextFloat();
        }
        for(int i=0; i<n; ++i) 
            total +=A[i];        
        System.out.println("Tổng các giá trị trong mảng của bạn là: "+ (float)total);

    }
}
