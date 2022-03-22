package Hinhtron;

import java.util.Scanner;

public class HinhChuNhat {
    float cdai;
    float crong;
    float cvhcn;
    float dthcn;
    public void nhapChieuDai() {
        System.out.println("Hãy nhập chiều dài hình chữ nhật:  ");
        Scanner sc = new Scanner(System.in);
        cdai = sc.nextFloat();
        sc.close();
    }
    public void nhapChieuRong() {
        System.out.println("Hãy nhập chiều rộng hình chữ nhật:  ");
        Scanner sc = new Scanner(System.in);
        crong = sc.nextFloat();
        sc.close();
    }
    public void tinhChuVi() {
        cvhcn = (cdai + crong) * 2;
    }

    public void tinhDienTich() {
        dthcn = cdai * crong;
    }

    public void inChuVi() {
        System.out.println("Chu vi hình chữ nhật:  ");
        Scanner sc = new Scanner(System.in);
        cdai = sc.nextFloat();
        sc.close();
    }
    public void inDienTich() {
        System.out.println("Hãy nhập chiều dài hình chữ nhật:  ");
        Scanner sc = new Scanner(System.in);
        cdai = sc.nextFloat();
        sc.close();
    }
}
