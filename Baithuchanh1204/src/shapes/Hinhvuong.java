package shapes;

import java.util.Scanner;

public class Hinhvuong  extends Hinhchunhat{

    public Hinhvuong() {
        ten = "Hinh Vuong";
    }

    public void nhapCanh() {
        System.out.println("Nhap canh = ");
        Scanner sc = new Scanner(System.in);
        chieuDai = chieuRong = sc.nextFloat();
        sc.close();
    }
}
