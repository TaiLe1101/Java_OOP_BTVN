package javacb.btvn.kethua.bt2;

class ThiSinhKhoiA extends ThiSinh {
    private static final String[] MON_HOC = { "Toan", "Ly", "Hoa" };

    public ThiSinhKhoiA(String hoTen, String diaChi, int mucUuTien) {
        super(hoTen, diaChi, mucUuTien);
    }

    public String[] getMonHoc() {
        return MON_HOC;
    }
}