package javacb.btvn.kethua.bt3;

class XeMay extends PhuongTienGiaoThong {
    private int congXuat;

    public XeMay() {
        super();
    }

    public XeMay(String id, String hangSanXuat, int namSanXuat, double giaBan, String mauXe, int congXuat) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.congXuat = congXuat;
    }

    public int getCongXuat() {
        return congXuat;
    }

    @Override
    public String toString() {
        return "Xe may:\n" +
                super.toString() +
                "\nCong xuat: " + congXuat;
    }
}
