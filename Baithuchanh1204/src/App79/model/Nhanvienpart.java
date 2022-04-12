package App79.model;

import App79.util.Configs;

public class Nhanvienpart extends Nhanvien{
    private int gioLamViec;

    public Nhanvienpart(String ten, int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien thoi vu";
    }

    public void tinhLuong() {
        luong = Configs.LUONG_NHAN_VIEN_PART_MOI_GIO * gioLamViec;
    }
}
