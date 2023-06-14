package javacb.btvn.kethua.bt2;

public class ThiSinhKhoiC extends ThiSinh {

    public ThiSinhKhoiC() {
        super();
    }

    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);

    }

    @Override
    public String getKhoiThi() {
        return "Khoi C: Van, Su, Dia";
    }

}
