package javacb.btvn.oop.bt6;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySanXuat;
    private Date ngayHetHan;

    public HangThucPham(String maHang, String tenHang, double donGia, String ngaySanXuat, String ngayHetHan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
    }

    public HangThucPham(String maHang) {
        this.maHang = maHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getNgaySanXuat() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(ngaySanXuat);
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngaySanXuat = dateFormat.parse(ngaySanXuat);
        } catch (ParseException e) {
            System.out.println("Ngay san xuat khong hop le. Ngay san xuat mac dinh duoc su dung.");
            this.ngaySanXuat = new Date();
        }
    }

    public String getNgayHetHan() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(ngayHetHan);
    }

    public void setNgayHetHan(String ngayHetHan) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date ngayHH = dateFormat.parse(ngayHetHan);
            if (ngayHH.after(ngaySanXuat)) {
                this.ngayHetHan = ngayHH;
            } else {
                System.out.println("Ngay het han phai sau ngay san xuat. Ngay het han mac dinh duoc su dung.");
                this.ngayHetHan = new Date();
            }
        } catch (ParseException e) {
            System.out.println("Ngay het han khong hop le. Ngay het han mac dinh duoc su dung.");
            this.ngayHetHan = new Date();
        }
    }

    public boolean daHetHan() {
        Date currentDate = new Date();
        return ngayHetHan.before(currentDate);
    }

    public String toString() {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setGroupingUsed(true);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Ma hang: " + maHang +
                "\nTen hang: " + tenHang +
                "\nDon gia: " + numberFormat.format(donGia) +
                "\nNgay san xuat: " + dateFormat.format(ngaySanXuat) +
                "\nNgay het han: " + dateFormat.format(ngayHetHan);
    }

}
