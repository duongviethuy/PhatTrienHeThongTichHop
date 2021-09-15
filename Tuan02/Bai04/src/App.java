import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Chương trình tính tổng từ 1 đến n");      
        System.out.println("Cho n= -1 để kết thúc chương trình");       
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập n= ");        
            int n = sc.nextInt();
            if (n==-1) break;            
            int total = 0;
            for(int i=0; i<=n; i++) 
                total += i;            
            System.out.println("Tổng từ 1 đến " + n + " là: " + total);            
        } 
    }
}
