package shapes;

import java.util.Scanner;

public class Hinhchunhat extends Hinhhoc {
    public float chieuDai;
    public float chieuRong;

    public Hinhchunhat() {
        ten = "Hinh Chu Nhat";
    }

    public void nhapChieuDai() {
        System.out.println("Chieu Dai = ");
        Scanner sc = new Scanner(System.in);
        chieuDai = sc.nextFloat();
        sc.close();
    }

    public void nhapChieuRong() {
        System.out.println("Chieu Rong = ");
        Scanner sc = new Scanner(System.in);
        chieuRong = sc.nextFloat();
        sc.close();
    }

    public void tinhDienTich() {
        dienTich = chieuDai * chieuRong;
    }

    public void tinhChuVi() {
        chuVi= 2 * (chieuDai + chieuRong);
    }
}
