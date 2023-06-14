package javacb.btvn.kethua.bt3;

class XeTai extends PhuongTienGiaoThong {
    private double trongTai;

    public XeTai(String id, String hangSanXuat, int namSanXuat, double giaBan, String mauXe, double trongTai) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    @Override
    public String toString() {
        return "Xe tai:\n" +
                super.toString() +
                "\nTrong Tai: " + trongTai;
    }

}
