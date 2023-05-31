package javacb.btvn.oop.bt7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();

        SinhVien[] danhSachSinhVien = new SinhVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Ma sinh vien: ");
            int maSinhVien = sc.nextInt();
            sc.nextLine();

            System.out.print("Ho ten: ");
            String hoTen = sc.nextLine();

            System.out.print("Dia chi: ");
            String diaChi = sc.nextLine();

            System.out.print("So dien thoai: ");
            String soDienThoai = sc.nextLine();

            SinhVien sinhVien = new SinhVien(maSinhVien, hoTen, diaChi, soDienThoai);
            danhSachSinhVien[i] = sinhVien;
        }

        compareSV(danhSachSinhVien);

        System.out.println("\nDanh sach sinh vien:");
        for (SinhVien sinhVien : danhSachSinhVien) {
            System.out.println(sinhVien.toString());
            System.out.println("--------------------");
        }
    }

    private static void compareSV(SinhVien[] danhSachSinhVien) {
        quickSort(danhSachSinhVien, 0, danhSachSinhVien.length - 1);
    }

    private static void quickSort(SinhVien[] danhSachSinhVien, int low, int high) {
        if (low < high) {
            int pi = partition(danhSachSinhVien, low, high);
            quickSort(danhSachSinhVien, low, pi - 1);
            quickSort(danhSachSinhVien, pi + 1, high);
        }
    }

    private static int partition(SinhVien[] danhSachSinhVien, int low, int high) {
        int pivot = danhSachSinhVien[high].getMaSinhVien();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (danhSachSinhVien[j].getMaSinhVien() < pivot) {
                i++;
                SinhVien temp = danhSachSinhVien[i];
                danhSachSinhVien[i] = danhSachSinhVien[j];
                danhSachSinhVien[j] = temp;
            }
        }
        SinhVien temp = danhSachSinhVien[i + 1];
        danhSachSinhVien[i + 1] = danhSachSinhVien[high];
        danhSachSinhVien[high] = temp;
        return i + 1;
    }

}
