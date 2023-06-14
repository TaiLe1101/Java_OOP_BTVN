package javacb.btvn.kethua.bt2;

public class ThiSinhKhoiB extends ThiSinh {

    public ThiSinhKhoiB() {
        super();
    }

    public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);

    }

    @Override
    public String getKhoiThi() {
        return "Khoi B: Toan, Hoa, Sinh";
    }

}
