package Hinhtron;

public class App2203 {
    public static void main(String[] args) throws Exception {
        HinhTron ht = new HinhTron();
        HinhChuNhat hcn = new HinhChuNhat();
        Person ps = new Person();
        SinhVien sv = new SinhVien();
        PhuongTrinhBacHai ptbh = new PhuongTrinhBacHai();

        //Hình tròn
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();
        System.out.println("end Hình tròn");

        //Hình chữ nhật
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();
        System.out.println("end Hình chữ nhật");

        //Person
        ps.nhapThongTin();
        ps.inThongTin();
        System.out.println("end Person");

        //Sinh Viên
        sv.nhapThongTin();
        sv.inThongTin();
        System.out.println(" end Sinh viên");

        //Giải phương trình bậc 2
        ptbh.nhapThongTin();
        ptbh.giaiPhuongTrinh();
        ptbh.inKetQua();
    }
}

