package javacb.btvn.oop.bt3;

import java.util.Scanner;

public class Vehicle {
    private String tenChuXe, loaiXe;
    private int dungTich;
    private double triGia;

    public Vehicle() {
        this.tenChuXe = this.loaiXe = "";
    }

    public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    private double tinhTienThue() {
        if (this.dungTich < 100) {
            return this.triGia * 0.1;
        } else if (this.dungTich >= 100 && this.dungTich <= 200) {
            return this.triGia * 0.3;
        } else {
            return this.triGia * 0.5;
        }
    }

    public void nhapThongTinXe() {
        Scanner scNumber = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        System.out.print("Loai xe: ");
        this.loaiXe = scString.nextLine();

        System.out.print("Dung Tich: ");
        this.dungTich = scNumber.nextInt();

        System.out.print("Tri gia: ");
        this.triGia = scNumber.nextDouble();

        System.out.print("Ten Chu Xe: ");
        this.tenChuXe = scString.nextLine();
    }

    public void xuatThongTinXe() {
        System.out.printf("%-20s %-20s %d \t\t %.2f \t %.2f\n", this.tenChuXe, this.loaiXe, this.dungTich,
                this.triGia,
                this.tinhTienThue());
    }
}
