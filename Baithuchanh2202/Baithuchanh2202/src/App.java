import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num1, num2;
        Scanner bai1 =  new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        num1 = bai1.nextInt();
        System.out.println("Nhap so thu hai: ");
        num2 = bai1.nextInt();

        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        System.out.println("UCLL cua 2 so la : " + num2);
        
        bai1.close();
    }
}
