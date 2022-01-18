import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta;

        System.out.println("Nhap he so a: ");
        a = sc.nextDouble();
        System.out.println("Nhap he so b: ");
        b = sc.nextDouble();
        System.out.println("Nhap he so c: ");
        c = sc.nextDouble();  

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                System.out.println("Phuong trinh co mot nghiem x= " + (-c / b));
            }
            return;
        }
        delta = b*b - 4*a*c;
        if (delta >0) {
            System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + (-b + Math.sqrt(delta))/(2*a) + " x2= " + (-b - Math.sqrt(delta))/(2*a));
        } else if(delta == 0) {
            System.out.println("Phuong trinh co 1 nghiem kep x = " + (-b/(2*a)));
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }

    }
}