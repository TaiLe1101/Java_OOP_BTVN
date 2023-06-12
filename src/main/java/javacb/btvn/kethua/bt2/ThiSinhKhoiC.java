package javacb.btvn.kethua.bt2;

class ThiSinhKhoiC extends ThiSinh {
    private static final String[] MON_HOC = { "Van", "Su", "Dia" };

    public ThiSinhKhoiC(String hoTen, String diaChi, int mucUuTien) {
        super(hoTen, diaChi, mucUuTien);
    }

    public String[] getMonHoc() {
        return MON_HOC;
    }
}