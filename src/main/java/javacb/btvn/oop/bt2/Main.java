package javacb.btvn.oop.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scNumber = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        // Khởi tạo các sinh viên
        SinhVien sv1 = new SinhVien(01, "Nguyen Van A", 6.5f, 7.2f);
        SinhVien sv2 = new SinhVien(02, "Le Thi B", 9.0f, 10);
        SinhVien sv3 = new SinhVien();

        // Nhập thông tin sinh viên
        System.out.print("Nhap ma sv: ");
        sv3.setMaSV(scNumber.nextInt());
        System.out.print("Nhap ho ten sv: ");
        sv3.setHoTenSV(scString.nextLine());
        System.out.print("Nhap diem ly thuyet: ");
        sv3.setDiemLT(scNumber.nextFloat());
        System.out.print("Nhap thuc hanh: ");
        sv3.setDiemTH(scNumber.nextFloat());

        // Xuất thông tin các sinh viên
        System.out.println("=====================================================");
        System.out.println("MSSV \t Ho va ten sv \t\t\t\t diem LT diem TH diem TB");
        sv1.xuatThongTin();
        System.out.println();
        sv2.xuatThongTin();
        System.out.println();
        sv3.xuatThongTin();
    }
}
