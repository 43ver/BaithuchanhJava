package person;

public class Person {
    public String hoVaTen;
    public int tuoi;
    public String gioiTinh;
    public String ngheNghiep;
    
    public void xuatNgheNghiep() {
        System.out.println("Nghe Nghiep: " + ngheNghiep);
    }
    
    public void inThongTin() {
        System.out.println("Ho va Ten: " + hoVaTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + gioiTinh);
    }
}