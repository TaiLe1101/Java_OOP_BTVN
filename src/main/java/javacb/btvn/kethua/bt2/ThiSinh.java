package javacb.btvn.kethua.bt2;

import java.util.UUID;

public class ThiSinh {
    private String soBaoDanh;
    private String hoTen;
    private String diaChi;
    private int mucUuTien;

    public ThiSinh() {
        this.soBaoDanh = "";
        this.hoTen = "";
        this.diaChi = "";
        this.mucUuTien = 0;
    }

    public ThiSinh(String hoTen, String diaChi, int mucUuTien) {
        this.soBaoDanh = UUID.randomUUID().toString();
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
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

    @Override
    public String toString() {
        return "So bao danh: " + soBaoDanh + "\n" +
                "Ho ten: " + hoTen + "\n" +
                "Dia chi: " + diaChi + "\n" +
                "Muc uu tien: " + mucUuTien;
    }

}
