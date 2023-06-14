package javacb.btvn.kethua.bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyPhuongTien quanLyPhuongTien = new QuanLyPhuongTien();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Them phuong tien");
            System.out.println("2. Danh sach phuong tien");
            System.out.println("3. Xoa phuong tien");
            System.out.println("4. Tim phuong tien theo hang san xuat");
            System.out.println("5. Tim phuong tien theo mau xe");
            System.out.println("6. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: {
                    quanLyPhuongTien.themPhuongTien();
                    break;
                }
                case 2: {
                    quanLyPhuongTien.hienThiPhuongTien();
                    break;
                }
                case 3: {
                    System.out.print("Nhap ID phuong tien can xoa: ");
                    String idXoa = sc.nextLine();
                    quanLyPhuongTien.xoaPhuongTien(idXoa);
                    break;
                }
                case 4: {
                    System.out.print("Nhap hang can tim: ");
                    String hangSanXuat = sc.nextLine();
                    quanLyPhuongTien.timPhuongTienTheoHangSanXuat(hangSanXuat);
                    break;
                }
                case 5: {
                    System.out.print("Nhap mau xe can tim: ");
                    String mauXe = sc.nextLine();
                    quanLyPhuongTien.timPhuongTienTheoMauXe(mauXe);
                    break;
                }
                case 6: {
                    System.out.println("Cam on ban da su dung ung dung");
                    break;
                }
                default: {
                    System.out.println("Khong co chuc nang nay!");
                    break;
                }
            }
        } while (choice != 6);
    }
}