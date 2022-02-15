import java.util.Scanner;

public class app35 {
    public static void main(String[] args) throws Exception {
        Scanner sc2 = new Scanner(System.in);
        int a,b;
        System.out.println("Nhập số a: ");
        a = sc2.nextInt();
        System.out.println("Nhập số b: ");
        b = sc2.nextInt();

        if(a > b) {
            System.out.println("Số nhỏ nhất là: " + b);
        } else {
            System.out.println("Số nhỏ nhất là: " + a);
        }
        sc2.close();   
    }
}