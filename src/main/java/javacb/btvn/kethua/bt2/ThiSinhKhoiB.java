package javacb.btvn.kethua.bt2;

class ThiSinhKhoiB extends ThiSinh {
    private static final String[] MON_HOC = { "Toan", "Hoa", "Sinh" };

    public ThiSinhKhoiB(String hoTen, String diaChi, int mucUuTien) {
        super(hoTen, diaChi, mucUuTien);
    }

    public String[] getMonHoc() {
        return MON_HOC;
    }
}