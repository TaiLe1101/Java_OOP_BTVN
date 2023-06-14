package javacb.btvn.kethua.bt1;

public class TaiLieu {
    private String maTaiLieu, tenNhaSanXuat;
    private int soBanPhatHanh;

    public TaiLieu() {
        this.maTaiLieu = "";
        this.tenNhaSanXuat = "";
        this.soBanPhatHanh = 1;
    }

    public TaiLieu(String maTaiLieu, String tenNhaSanXuat, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaSanXuat = tenNhaSanXuat;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {

        this.maTaiLieu = maTaiLieu;
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
