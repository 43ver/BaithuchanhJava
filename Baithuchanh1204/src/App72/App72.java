package App72;

public class App72 {
    public static void main(String[] args) throws Exception {
        // khởi tạo đối tượng hinhTron từ lớp HinhTron
        Hinhtron hinhTron = new Hinhtron();

        //set bán kính  cho hinhTron thông qua phuong thuc setter
        hinhTron.setBanKinh(10);

        // các tính toán khác
        float chuVi =  hinhTron.tinhChuVi();
        float dienTich = hinhTron.tinhDienTich();
        System.out.println("Chu vi hinh tron: " + chuVi);
        System.out.println("Dien tich hinh tron: " + dienTich);
    }
}

