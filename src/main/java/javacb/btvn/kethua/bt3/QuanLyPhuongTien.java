package javacb.btvn.kethua.bt3;

import java.util.ArrayList;
import java.util.Scanner;

class QuanLyPhuongTien {
    private ArrayList<PhuongTienGiaoThong> danhSachPhuongTien;

    public QuanLyPhuongTien() {
        danhSachPhuongTien = new ArrayList<>();
    }

    public void themPhuongTien() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ID: ");
        String id = sc.nextLine();

        System.out.print("Nhap hang san xuat: ");
        String hangSanXuat = sc.nextLine();

        System.out.print("Nhap nam san xuat: ");
        int namSanXuat = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap gia ban: ");
        double giaBan = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap mau xe: ");
        String mauXe = sc.nextLine();
        int loaiPhuongTien;
        do {
            System.out.print("Nhap Loai Phuong Tien (1 - Oto, 2 - Xe may, 3 - Xe tai): ");
            loaiPhuongTien = Integer.parseInt(sc.nextLine());

            PhuongTienGiaoThong phuongTien;
            switch (loaiPhuongTien) {
                case 1: {
                    System.out.print("Nhap so cho ngoi: ");
                    int soChoNgoi = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhap kieu dong co: ");
                    String kieuDongCo = sc.nextLine();

                    phuongTien = new Oto(id, hangSanXuat, namSanXuat, giaBan, mauXe, soChoNgoi, kieuDongCo);
                    break;
                }
                case 2: {
                    System.out.print("Nhap cong xuat: ");
                    int congXuat = Integer.parseInt(sc.nextLine());

                    phuongTien = new XeMay(id, hangSanXuat, namSanXuat, giaBan, mauXe, congXuat);
                    break;
                }
                case 3: {
                    System.out.print("Nhap trong tai: ");
                    double trongTai = Double.parseDouble(sc.nextLine());

                    phuongTien = new XeTai(id, hangSanXuat, namSanXuat, giaBan, mauXe, trongTai);
                    break;
                }
                default: {
                    System.out.println("Loai phuong tien khong hop le!");
                    continue;
                }
            }

            danhSachPhuongTien.add(phuongTien);
            System.out.println("Them phuong tien thanh cong!");

        } while (loaiPhuongTien != 1 && loaiPhuongTien != 2 && loaiPhuongTien != 3);

    }

    public void xoaPhuongTien(String id) {
        boolean tonTai = false;
        for (PhuongTienGiaoThong phuongTien : danhSachPhuongTien) {
            if (phuongTien.getId().equals(id)) {
                danhSachPhuongTien.remove(phuongTien);
                System.out.println("Xoa phuong tien thanh cong!");
                tonTai = true;
                break;
            }
        }

        if (!tonTai) {
            System.out.println("Khong tim thay phuong tien voi ID " + id);
        }
    }

    public void timPhuongTienTheoHangSanXuat(String hangSanXuat) {
        boolean tonTai = false;
        for (PhuongTienGiaoThong phuongTien : danhSachPhuongTien) {
            if (phuongTien.getHangSanXuat().equalsIgnoreCase(hangSanXuat)) {
                System.out.println(phuongTien);
                tonTai = true;
            }
        }

        if (!tonTai) {
            System.out.println("Khong tim thay phuong tien cua hang san xuat:  " + hangSanXuat);
        }
    }

    public void timPhuongTienTheoMauXe(String mauXe) {
        boolean tonTai = false;
        for (PhuongTienGiaoThong phuongTien : danhSachPhuongTien) {
            if (phuongTien.getMauXe().equalsIgnoreCase(mauXe)) {
                System.out.println(phuongTien);
                tonTai = true;
            }
        }

        if (!tonTai) {
            System.out.println("Khong tim thay phuong tien cu mau xe:  " + mauXe);
        }
    }

    public void hienThiPhuongTien() {
        if (!danhSachPhuongTien.isEmpty()) {
            for (PhuongTienGiaoThong phuongTienGiaoThong : danhSachPhuongTien) {
                System.out.println("------------------------------------");
                System.out.println(phuongTienGiaoThong);
            }
            System.out.println("------------------------------------");
        } else {
            System.out.println("------------------------------------");
            System.out.println("Danh sach rong!!!");
        }
    }
}