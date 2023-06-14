package javacb.btvn.kethua.bt2;

public class ThiSinhKhoiA extends ThiSinh {
    public ThiSinhKhoiA() {
        super();
    }

    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);

    }

    @Override
    public String getKhoiThi() {
        return "Khoi A: Toan, Ly, Hoa";
    }

}
