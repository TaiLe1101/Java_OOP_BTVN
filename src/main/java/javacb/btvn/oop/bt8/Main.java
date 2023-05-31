package javacb.btvn.oop.bt8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong CD: ");
        int n = sc.nextInt();
        sc.nextLine();

        DanhSachCD danhSachCD = new DanhSachCD(n);

        int choice;
        do {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Them CD");
            System.out.println("2. So luong CD");
            System.out.println("3. Tong gia thanh");
            System.out.println("4. Sap xep theo gia thanh giam dan");
            System.out.println("5. Sap xep theo tua CD tang dan");
            System.out.println("6. Xuat danh sach CD");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Nhap thong tin CD:");
                    System.out.print("Ma CD: ");
                    int maCD = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tua CD: ");
                    String tuaCD = sc.nextLine();
                    System.out.print("Ca sy: ");
                    String caSy = sc.nextLine();
                    System.out.print("So bai hat: ");
                    int soBaiHat = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Gia thanh: ");
                    double giaThanh = sc.nextDouble();
                    sc.nextLine();

                    CD cd = new CD(maCD, tuaCD, caSy, soBaiHat, giaThanh);
                    danhSachCD.themCD(cd);
                    break;
                case 2:
                    System.out.println("So luong CD: " + danhSachCD.soLuongCD());
                    break;
                case 3:
                    System.out.println("Tong gia thanh: " + danhSachCD.tongGiaThanh());
                    break;
                case 4:
                    danhSachCD.sapXepTheoGiaThanhGiamDan();
                    System.out.println("Da sap xep danh sach theo gia thanh giam dan.");
                    break;
                case 5:
                    danhSachCD.sapXepTheoTuaCDTangDan();
                    System.out.println("Da sap xep danh sach theo tua CD tang dan.");
                    break;
                case 6:
                    danhSachCD.xuatDanhSachCD();
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        } while (choice != 0);

    }
}
