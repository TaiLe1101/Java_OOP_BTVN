package javacb.btvn.kethua.bt2;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    private ArrayList<ThiSinh> danhSachThiSinh;

    public TuyenSinh() {
        danhSachThiSinh = new ArrayList<ThiSinh>();
    }

    public void themThiSinh() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so bao danh: ");
        String soBaoDanh = sc.nextLine();

        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhap dia chi: ");
        String diaChi = sc.nextLine();

        System.out.print("Nhap muc uu tien: ");
        int mucUuTien = sc.nextInt();
        sc.nextLine();

        String khoiThi;
        do {
            System.out.print("Nhap khoi thi (A, B, C): ");
            khoiThi = sc.nextLine();

            ThiSinh thiSinh;
            if (khoiThi.equalsIgnoreCase("A")) {
                thiSinh = new ThiSinhKhoiA(soBaoDanh, hoTen, diaChi, mucUuTien);
            } else if (khoiThi.equalsIgnoreCase("B")) {
                thiSinh = new ThiSinhKhoiB(soBaoDanh, hoTen, diaChi, mucUuTien);
            } else if (khoiThi.equalsIgnoreCase("C")) {
                thiSinh = new ThiSinhKhoiC(soBaoDanh, hoTen, diaChi, mucUuTien);
            } else {
                System.out.println("Khoi thi khong hop le!");
                continue;
            }

            danhSachThiSinh.add(thiSinh);
            System.out.println("Them thanh cong");
        } while (!khoiThi.equalsIgnoreCase("a") && !khoiThi.equalsIgnoreCase("b") && !khoiThi.equalsIgnoreCase("c"));

    }

    public void hienThiThongTin() {
        for (ThiSinh thiSinh : danhSachThiSinh) {
            System.out.println("-------------------------");
            System.out.println(thiSinh);
        }
    }

    public void timKiemTheoSoBaoDanh(String soBaoDanh) {
        boolean tonTai = false;
        for (ThiSinh thiSinh : danhSachThiSinh) {
            if (thiSinh.getSoBaoDanh().equalsIgnoreCase(soBaoDanh)) {
                System.out.println("-------------------------");
                System.out.println(thiSinh);
                tonTai = true;
                break;
            }
        }

        if (!tonTai) {
            System.out.println("Khong tim thay thi sinh : " + soBaoDanh);
        }
    }
}
