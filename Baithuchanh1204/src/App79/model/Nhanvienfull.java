package App79.model;

import App79.util.Configs;

public class Nhanvienfull extends Nhanvien{
    private int ngayLamThem;
    private int loaiChucVu;

    public Nhanvienfull(String ten, int ngayLamThem) {
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien toan thoi gian";
    }

    public void tinhLuong() {
        luong = Configs.LUONG_NHAN_VIEN_FULL_LINH ;
    }
}
