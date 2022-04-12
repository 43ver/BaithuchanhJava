package App77;

import java.util.Scanner;

public class Hinhtron extends Hinhhoc{
    protected float banKinh;
    private Scanner scanner;

    public Hinhtron() {
        super();
        scanner = new Scanner(System.in);
    }

    public void nhapBanKinh() {
        // Nhập đơn vị tính là cm hay inch
        System.out.println("Ban dung don vi tinh nao: ");
        System.out.println("\t1 - Centimet");
        System.out.println("\t2 - Inch");
        Configs.donVi = scanner.nextInt();

        // Sau đó nhập bán kính
        System.out.println("Nhap ban kinh: ");
        banKinh = scanner.nextFloat();
    }

    public void inThongTin() {
        if(Configs.donVi == Configs.DON_VI_CM) {
            System.out.println("Hinh tron co ban kinh: " + banKinh + "cm");
            System.out.println("Tuong duong: " + Configs.chuyenCmsangInch(banKinh) + "inch");
        }else{
            System.out.println("Hinh tron co ban kinh: " + banKinh + "icnh");
            System.out.println("Tuong duong: " + Configs.chuyenInchsangCm(banKinh) + "cm");
        }
    }
}
