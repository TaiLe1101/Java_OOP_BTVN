package javacb.btvn.oop.bt7;

public class SinhVien {
    private int maSinhVien;
    private String hoTen;
    private String diaChi;
    private String soDienThoai;

    public SinhVien() {
    }

    public SinhVien(int maSinhVien, String hoTen, String diaChi, String soDienThoai) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
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

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "Ma sinh vien: " + maSinhVien +
                "\nHo ten: " + hoTen +
                "\nDia chi: " + diaChi +
                "\nSo dien thoai: " + soDienThoai;
    }

}
