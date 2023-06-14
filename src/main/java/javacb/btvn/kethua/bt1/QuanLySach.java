package javacb.btvn.kethua.bt1;

import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<TaiLieu> danhSachTaiLieu;
    private static int maTaiLieu;

    public QuanLySach() {
        this.danhSachTaiLieu = new ArrayList<TaiLieu>();
        maTaiLieu = 0;
    }

    public void themMoi(TaiLieu taiLieu) {
        String generateMaTaiLieu = taiLieu.getClass().getSimpleName() + " " + ((maTaiLieu++) + 1);
        taiLieu.setMaTaiLieu(generateMaTaiLieu);
        danhSachTaiLieu.add(taiLieu);
        System.out.println("Them moi thanh cong");
        System.out.println("------------------------------");
    }

    public void xoaTheoMa(String maTaiLieu) {
        if (!danhSachTaiLieu.isEmpty()) {
            boolean daXoa = false;

            for (TaiLieu taiLieu : danhSachTaiLieu) {
                if (taiLieu.getMaTaiLieu().equalsIgnoreCase(maTaiLieu)) {
                    danhSachTaiLieu.remove(taiLieu);
                    daXoa = true;
                    break;
                }
            }
            if (daXoa) {
                System.out.println("Da xoa thanh cong tai lieu co ma: " + maTaiLieu);
                System.out.println("------------------------------");
            } else {
                System.out.println("Khong co tai lieu co ma: " + maTaiLieu);
                System.out.println("------------------------------");
            }

        } else {
            System.out.println("Danh sach rong!!");
            System.out.println("------------------------------");
        }
    }

    public void timKiemTheoLoai(String loaiTaiLieu) {
        System.out.println("------------------------------");
        for (TaiLieu taiLieu : danhSachTaiLieu) {
            if (taiLieu.getClass().getSimpleName().equalsIgnoreCase(loaiTaiLieu)) {
                System.out.println(taiLieu);
            }
        }
        System.out.println("------------------------------");
    }

    public void hienThiThongTin() {
        if (!danhSachTaiLieu.isEmpty()) {
            System.out.println("------------------------------");
            for (TaiLieu taiLieu : danhSachTaiLieu) {
                System.out.println(taiLieu);
                System.out.println("------------------------------");
            }

        } else {
            System.out.println("Danh sach rong");
            System.out.println("------------------------------");
        }
    }
}
