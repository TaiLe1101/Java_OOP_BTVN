package javacb.btvn.kethua.bt1;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    private static QuanLySach quanLySach = new QuanLySach();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int luaChonChucNang;

        do {
            System.out.println("Hay chon chuc nang: ");
            System.out.println("\t1: Them moi tai leu");
            System.out.println("\t2: Xoa tai lieu theo ma tai lieu");
            System.out.println("\t3: Hien thi thong tin tai lieu");
            System.out.println("\t4: Tim kiem tai lieu theo loai");
            System.out.println("\t5: Thoat");
            System.out.print("\t\t -> Moi chon chuc nang: ");
            luaChonChucNang = Integer.parseInt(sc.nextLine());

            thucHienChucNangChinh(luaChonChucNang);
        } while (luaChonChucNang != 5);

    }

    private static void thucHienChucNangChinh(int luaChonChucNang) {
        switch (luaChonChucNang) {
            case 1: {
                int luaChonTaiLieu;
                do {
                    menuChonLoai();
                    luaChonTaiLieu = Integer.parseInt(sc.nextLine());
                    thucHienThemTaiLieu(luaChonTaiLieu, quanLySach);
                } while (luaChonTaiLieu != 4);
                break;
            }
            case 2: {
                System.out.print("Nhap ma tai lieu: ");
                String maTaiLieu = sc.nextLine();

                quanLySach.xoaTheoMa(maTaiLieu);
                break;
            }
            case 3: {
                System.out.println("Thong tin: ");
                quanLySach.hienThiThongTin();
                break;
            }
            case 4: {
                int luaChonTaiLieu;
                do {
                    menuChonLoai();
                    luaChonTaiLieu = Integer.parseInt(sc.nextLine());
                    thucHienHienThiTaiLieuTheoLoai(luaChonTaiLieu, quanLySach);
                } while (luaChonTaiLieu != 4);
                break;
            }
            case 5: {
                System.out.println("Ban da thoat chuong trinh");
                break;
            }

            default: {
                System.out.println("Khong co chuc nang nay!!!");
                break;
            }
        }
    }

    private static void thucHienHienThiTaiLieuTheoLoai(int luaChonTaiLieu, QuanLySach quanLySach) {
        switch (luaChonTaiLieu) {
            case 1: {
                quanLySach.timKiemTheoLoai("Sach");
                break;
            }
            case 2: {

                quanLySach.timKiemTheoLoai("TapChi");
                break;
            }
            case 3: {

                quanLySach.timKiemTheoLoai("Bao");
                break;
            }
            case 4: {
                break;
            }

            default: {
                System.out.println("Khong co lua chon nay");
                break;
            }
        }
    }

    private static void thucHienThemTaiLieu(int luaChonTaiLieu, QuanLySach quanLySach) {

        switch (luaChonTaiLieu) {
            case 1: {
                Sach sach = new Sach();

                nhapThongTinTaiLieu(sach);

                System.out.print("Ten tac gia: ");
                sach.setTenTacGia(sc.nextLine());

                System.out.print("So trang: ");
                sach.setSoTrang(Integer.parseInt(sc.nextLine()));

                quanLySach.themMoi(sach);
                break;
            }
            case 2: {
                TapChi tapChi = new TapChi();

                nhapThongTinTaiLieu(tapChi);

                System.out.print("So phat hanh: ");
                tapChi.setSoPhatHanh(Integer.parseInt(sc.nextLine()));

                System.out.print("Thang phat hanh: ");
                tapChi.setThangPhatHanh(Integer.parseInt(sc.nextLine()));

                quanLySach.themMoi(tapChi);
                break;
            }
            case 3: {
                Bao bao = new Bao();

                nhapThongTinTaiLieu(bao);

                System.out.print("Nhap ngay (dd/MM/yyy): ");
                String inputDate = sc.nextLine();

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date date = null;

                try {
                    date = dateFormat.parse(inputDate);
                } catch (Exception err) {
                    System.out.println("Ngay khong hop le");
                }
                if (date != null) {
                    bao.setNgayPhatHanh(date);
                }

                quanLySach.themMoi(bao);
                break;
            }
            case 4: {
                break;
            }
            default: {
                System.out.println("Loi lua chon");
                break;
            }
        }
    }

    private static void menuChonLoai() {
        System.out.println("Hay chon loai tai lieu muon them: ");
        System.out.println("\t1: Sach");
        System.out.println("\t2: Tap chi");
        System.out.println("\t3: Bao");
        System.out.println("\t4: Tro ve");
        System.out.print("\t\t -> Moi chon: ");
    }

    private static void nhapThongTinTaiLieu(TaiLieu taiLieu) {
        System.out.print("Nhap so ban phat hanh: ");
        taiLieu.setSoBanPhatHanh(Integer.parseInt(sc.nextLine()));

        System.out.print("Ten nha xuat ban: ");
        taiLieu.setTenNhaSanXuat(sc.nextLine());
    }
}
