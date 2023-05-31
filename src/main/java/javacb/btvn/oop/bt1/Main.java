package javacb.btvn.oop.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khởi tạo 1 đối tượng HinhChuNhat
        HinhChuNhat hcn = new HinhChuNhat();

        // Nhập thông tin hình chữ nhật
        System.out.print("Nhap chieu dai: ");
        hcn.setChieuDai(sc.nextDouble());
        System.out.print("Nhap chieu rong: ");
        hcn.setChieuRong(sc.nextDouble());

        // Xuất thông tin hình chữ nhật
        System.out.println("\nThong tin hinh chu nhat");
        System.out.println(hcn);

    }
}
