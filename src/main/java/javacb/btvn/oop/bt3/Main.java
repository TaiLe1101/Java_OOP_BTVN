package javacb.btvn.oop.bt3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner scNumber = new Scanner(System.in);
        int chucNang;
        Vehicle xe1 = new Vehicle();
        Vehicle xe2 = new Vehicle();
        Vehicle xe3 = new Vehicle();

        do {
            System.out.print(
                    "\nMoi chon chuc nang: \n\t1. Nhap thong tin xe1, xe2, xe3.\n\t2. Xuat bang ke khai tien thue truoc ba.\n\t3. Thoat\nChuc nang: ");
            chucNang = scNumber.nextInt();

            switch (chucNang) {
                case 1: {

                    System.out.println("Moi nhap thong tin xe 1: ");
                    xe1.nhapThongTinXe();

                    System.out.println("Moi nhap thong tin xe 2: ");
                    xe2.nhapThongTinXe();

                    System.out.println("Moi nhap thong tin xe 3: ");
                    xe3.nhapThongTinXe();
                    break;
                }
                case 2: {
                    System.out.printf("%-20s %-20s %-14s %-15s %-15s\n", "Ten chu xe", "Loai xe", "Dung tich",
                            "Tri gia",
                            "Thue phai nop");
                    xe1.xuatThongTinXe();
                    xe2.xuatThongTinXe();
                    xe3.xuatThongTinXe();
                    break;
                }
                case 3: {
                    System.out.println("Cam on da xu dung chuong trinh cua chung toi ^^!");
                    break;
                }
                default: {
                    System.out.println("Vui long chon chuc nang hop le");
                    break;
                }
            }

        } while (chucNang != 3);

    }
}
