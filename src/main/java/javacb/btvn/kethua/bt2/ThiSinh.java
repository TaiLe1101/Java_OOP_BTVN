package javacb.btvn.kethua.bt2;

public abstract class ThiSinh {
    private String soBaoDanh, hoTen, diaChi;
    private int mucUuTien;

    public ThiSinh() {
        soBaoDanh = "";
        hoTen = "";
        diaChi = "";

    }

    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(int mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    public abstract String getKhoiThi();

    @Override
    public String toString() {
        return "So bao danh: " + soBaoDanh +
                "\nHo ten: " + hoTen +
                "\nDia chi: " + diaChi +
                "\nMuc uu tien: " + mucUuTien +
                "\nKhoi thi: \n\t" + getKhoiThi();
    }

}
