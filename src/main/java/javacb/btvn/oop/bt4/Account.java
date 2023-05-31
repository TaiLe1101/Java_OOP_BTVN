package javacb.btvn.oop.bt4;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long soTaiKhoan;
    private String tenTaiKhoan;
    private double soTienTrongTaiKhoan;

    final private float LAI_SUAT = 0.035f;
    final private int PHI_RUT_TIEN = 5000;

    public Account() {
        tenTaiKhoan = "";
    }

    public Account(long soTaiKhoan, String tenTaiKhoan, double soTienTrongTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public Account(long soTaiKhoan, String tenTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTrongTaiKhoan = 50;
    }

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(double soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public float getLaiSuat() {
        return LAI_SUAT;
    }

    public int getPhiRutTien() {
        return PHI_RUT_TIEN;
    }

    public void napTienVaoTaiKhoan(double soTienNapVao) {
        if (soTienNapVao > 0) {
            this.soTienTrongTaiKhoan += soTienNapVao;

        } else {
            System.out.println("So tien khong hop le");
        }
    }

    public void rutTien(double soTienRut) {
        if (soTienRut > 0 && soTienRut <= this.soTienTrongTaiKhoan) {
            this.soTienTrongTaiKhoan -= (soTienRut + this.PHI_RUT_TIEN);
        } else {
            System.out.println("So tien khong hop le");
        }
    }

    public void daoHan() {
        this.soTienTrongTaiKhoan += this.soTienTrongTaiKhoan * this.LAI_SUAT;
    }

    public void chuyenKhoan(Account taiKhoan, double soTienMuonChuyen) {
        if (soTienMuonChuyen > 0 && soTienMuonChuyen <= this.soTienTrongTaiKhoan) {

            this.soTienTrongTaiKhoan -= soTienMuonChuyen;
            taiKhoan.napTienVaoTaiKhoan(soTienMuonChuyen);
        } else {
            System.out.println("So tien chuyen khoan khong hop le");
        }
    }

    @Override
    public String toString() {
        NumberFormat numberFormat = NumberFormat.getInstance(new Locale("vi", "VN"));
        return "- So tai khoan: " + this.soTaiKhoan +
                "\n- Ten tai khoan: " + this.tenTaiKhoan +
                "\n- So tien trong tai khoan: " + numberFormat.format(this.soTienTrongTaiKhoan) + " VND" +
                "\n- Lai suat: " + this.LAI_SUAT + "%";
    }

}
