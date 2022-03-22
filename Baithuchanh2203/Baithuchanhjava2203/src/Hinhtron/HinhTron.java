package Hinhtron;

import java.util.Scanner;

public class HinhTron {
    final 
    float PI =3.14f;
    float r;
    float cv;
    float dt;
    public void nhapBanKinh() {
        System.out.println("Hãy nhập bán kính hình tròn: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
        sc.close();
    }

    public void tinhChuVi() {
        cv = 2 * PI * r;
    }

    public void tinhDienTich() {
        dt = PI * r * r;
    }

    public void inChuVi() {
        System.out.println("Chu vi hình tròn: " + cv);
    }
    
    public void inDienTich() {
        System.out.println("Diện tích hình tròn: " + dt);
    }
}
