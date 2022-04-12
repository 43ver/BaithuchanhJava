package App73;

public class App73 {
    public static void main(String[] args) throws Exception {
        // Khởi tạo đối tượng sinh viên
        Sinhvien sinhVien = new Sinhvien();
        Sinhvien sinhvien2 = new Sinhvien();

        // Set thông tin vào cho các sinh viên
        sinhVien.setTen("");
        sinhVien.setTuoi(23);

        sinhvien2.setTen("Vinh");
        sinhvien2.setTuoi(24);

        // IN thông tin các sinh viên
        System.out.println("Sinh vien 1 co ten: " + sinhVien.getTen() + sinhVien.getTuoi() + "tuoi");
        System.out.println("Sinh vien 2 co ten: " + sinhvien2.getTen()+ sinhvien2.getTuoi() + "tuoi");
    }
}

