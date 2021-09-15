import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Diem a = new Diem();
        System.out.print("Nhập điểm tọa độ X: ");
        a.setX(sc.nextInt());
        System.out.print("Nhập điểm tọa độ Y: ");
        a.setY(sc.nextInt());
        System.out.println(a);
        a.khoangCach();
    }
}
