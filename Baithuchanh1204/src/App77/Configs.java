package App77;

public class Configs {
    // cấu hình số lượng hình học
    public static final int SO_LUONG_HINH_TOI_THIEU = 0;
    public static final int SO_LUONG_HINH_TOI_DA = 5;

    // các cấu hình khác
    public static final float PI = 3.14f;
    public static final float INCH_CM = 2.54f;
    public static final int DON_VI_CM = 1;
    public static final int DON_VI_INCH = 2;
    public static int donVi = DON_VI_CM;

    // Phương thức static giúp chuyển đổi cm sang inch
    public static float chuyenCmsangInch(float cm) {
        float inch = cm / INCH_CM;
        return inch;
    }

    // Phương thức static giúp chuyển đổi inch sang cm
    public static float chuyenInchsangCm(float inch) {
        float cm = inch * INCH_CM;
        return cm;
    }
}
