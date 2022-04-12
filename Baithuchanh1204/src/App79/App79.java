package App79;

import App79.model.Nhanvienfull;
import App79.model.Nhanvienpart;
import App79.util.Configs;

public class App79 {
    public static void main(String[] args) {
        // Công ty có 3 nhân viên toàn thời gian, trong đó có 1 sếp, sếp không làm thêm ngày nào
        Nhanvienfull sep = new Nhanvienfull("Trần Văn Sếp", 0);
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        Nhanvienfull linh1 = new Nhanvienfull("Nguyễn Văn Lính", 0); // Không làm thêm ngày nào
        Nhanvienfull linh2 = new Nhanvienfull("Lê Thị Lính", 3); // Làm thêm 3 ngày

        // Công ty đang thuê 1 nhân viên thời vụ
        Nhanvienpart thoiVu = new Nhanvienpart("Phan Thị Thời Vụ", 240); // Cô ấy siêng làm lắm
        // Tính lương cho nhân viên
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();
        // In thông tin nhân viên
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();

    }
}
