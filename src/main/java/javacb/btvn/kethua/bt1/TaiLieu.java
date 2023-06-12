package javacb.btvn.kethua.bt1;

import java.util.UUID;

public class TaiLieu {
    private String maTaiLieu;
    private String tenNhaSanXuat;
    private int soBanPhatHanh;

    public TaiLieu() {
        setMaTaiLieu("");
        this.tenNhaSanXuat = "";
        this.soBanPhatHanh = 1;
    }

    public TaiLieu(String maTaiLieu, String tenNhaSanXuat, int soBanPhatHanh) {
        setMaTaiLieu(maTaiLieu);
        this.tenNhaSanXuat = tenNhaSanXuat;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        UUID uuid = UUID.randomUUID();
        this.maTaiLieu = uuid + "_" + maTaiLieu;
    }

    public String getTenNhaSanXuat() {
        return tenNhaSanXuat;
    }

    public void setTenNhaSanXuat(String tenNhaSanXuat) {
        this.tenNhaSanXuat = tenNhaSanXuat;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return "\n\t- Ma tai lieu: " + this.maTaiLieu +
                "\n\t- Ten nha san xuat: " + this.tenNhaSanXuat +
                "\n\t- So ban phat hanh: " + this.soBanPhatHanh;
    }
}
