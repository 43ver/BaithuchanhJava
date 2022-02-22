import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        float a, b, c;
        Scanner bai2 = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        a = bai2.nextFloat();
        System.out.println("Nhap so thu hai: ");
        b = bai2.nextFloat();
        System.out.println("Nhap so thu ba: ");
        c = bai2.nextFloat();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Day khong phai mot tam giac!");
        } else {
            if ((a == b) && (b == c)) {
            System.out.println("Day la tam giac deu");
            } else {
                if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
                    System.out.println("Day la tam giac vuong");
                } else {
                    if (a==b || b==c || a==c) {
                        System.out.println("Day la tam giac can");
                    } else {
                        System.out.println("Day la tam giac thuong");
                    }
                }
            }
        }
        
        bai2.close();
    }
}
