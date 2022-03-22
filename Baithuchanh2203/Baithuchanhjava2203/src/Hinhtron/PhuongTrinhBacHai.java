package Hinhtron;

import java.util.Scanner;

public class PhuongTrinhBacHai {
        float a,b,c;
        float x1, x2, delta;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số bậc 2, a: ");
        a = sc.nextFloat();
        System.out.println("Nhập hệ số bậc 1, b = ");
        b = sc.nextFloat();
        System.out.println("Nhập hằng số tự do, c = ");
        c = sc.nextFloat();
        sc.close();
    }
    public void giaiPhuongTrinh() {
        //Kiểm tra điều kiện
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
            }
        }

    delta = b*b - 4*a*c;
    
    }
    public void inKetQua(){
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }  
}
