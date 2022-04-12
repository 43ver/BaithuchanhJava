package shapes;

import java.util.Scanner;

public class Hinhtron extends Hinhhoc {
    public float banKinh;

    public Hinhtron() {
        ten = "Hinh Tron";
    }

    public void nhapBanKinh() {
        System.out.println("Ban kinh = ");
        Scanner sc = new Scanner(System.in);
        banKinh = sc.nextFloat();
        sc.close();
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }
}
