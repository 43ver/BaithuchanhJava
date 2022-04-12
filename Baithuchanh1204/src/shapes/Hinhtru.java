package shapes;

import java.util.Scanner;

public class Hinhtru extends Hinhtron {
    public float chieuCao;

    public Hinhtru() {
        ten = "Hinh Tru";
    }

    public void nhapChieuCao() {
        nhapBanKinh();

        System.out.println("Chieu cao = ");
        Scanner sc = new Scanner(System.in);
        sc.close();
    }

    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}
