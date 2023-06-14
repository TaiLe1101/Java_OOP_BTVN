package javacb.btvn.kethua.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();
        Scanner sc = new Scanner(System.in);
        int chonChucNang;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Them moi thi sinh");
            System.out.println("2. Hien thi thong tin thi sinh");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("4. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            chonChucNang = Integer.parseInt(sc.nextLine());

            switch (chonChucNang) {
                case 1:
                    tuyenSinh.themThiSinh();
                    break;
                case 2:
                    tuyenSinh.hienThiThongTin();
                    break;
                case 3:
                    System.out.print("Nhap so bao danh: ");
                    String soBaoDanh = sc.nextLine();
                    tuyenSinh.timKiemTheoSoBaoDanh(soBaoDanh);
                    break;
                case 4:
                    System.out.println("Cam on da su dung ung dung");
                    break;
                default:
                    System.out.println("Khong co chuc nang nay");
            }
        } while (chonChucNang != 4);
    }
}