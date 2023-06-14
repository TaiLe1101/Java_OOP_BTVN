package javacb.btvn.kethua.bt3;

class PhuongTienGiaoThong {
    private String id, hangSanXuat, mauXe;
    private int namSanXuat;
    private double giaBan;

    public PhuongTienGiaoThong() {
        id = "";
        hangSanXuat = "";
        mauXe = "";
    }

    public PhuongTienGiaoThong(String id, String hangSanXuat, int namSanXuat, double giaBan, String mauXe) {
        this.id = id;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
        this.mauXe = mauXe;
    }

    public String getId() {
        return id;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public String getMauXe() {
        return mauXe;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                "\nHang san xuat: " + hangSanXuat +
                "\nNam san xuat: " + namSanXuat +
                "\nGia ban: " + giaBan +
                "\nMau xe: " + mauXe;
    }
}