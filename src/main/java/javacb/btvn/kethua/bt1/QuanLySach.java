package javacb.btvn.kethua.bt1;

public class QuanLySach {
    private TaiLieu[] danhSachTaiLieu;
    private int soLuongTaiLieu;

    public QuanLySach(int doDaiDanhSach) {
        this.danhSachTaiLieu = new TaiLieu[doDaiDanhSach];
        this.soLuongTaiLieu = 0;
    }

    public void themMoi(TaiLieu taiLieu) {
        if (this.soLuongTaiLieu < danhSachTaiLieu.length) {

            danhSachTaiLieu[soLuongTaiLieu] = taiLieu;
            this.soLuongTaiLieu++;

            System.out.println("Them moi thanh cong");
            System.out.println("------------------------------");
        } else {
            System.out.println("Danh sach da day");
            System.out.println("------------------------------");
        }
    }

    public void xoaTheoMa(String maTaiLieu) {
        if (this.soLuongTaiLieu > 0) {
            boolean daXoa = false;
            int viTriXoa = -1;

            for (int i = 0; i < soLuongTaiLieu; i++) {
                if (danhSachTaiLieu[i].getMaTaiLieu().equals(maTaiLieu)) {
                    viTriXoa = i;
                    daXoa = true;
                    break;
                }
            }

            if (daXoa) {
                for (int i = viTriXoa; i < soLuongTaiLieu - 1; i++) {
                    danhSachTaiLieu[i] = danhSachTaiLieu[i + 1];
                }

                danhSachTaiLieu[soLuongTaiLieu - 1] = null;
                soLuongTaiLieu--;

                System.out.println("Da xoa thanh cong tai lieu co ma: " + maTaiLieu);
                System.out.println("------------------------------");

            } else {
                System.out.println("Khong tim thay tai lieu co ma: " + maTaiLieu);
                System.out.println("------------------------------");
            }
        } else {
            System.out.println("Danh sach rong!!");
            System.out.println("------------------------------");
        }
    }

    public void timKiemTheoLoai(String loaiTaiLieu) {
        System.out.println("------------------------------");
        for (int i = 0; i < soLuongTaiLieu; i++) {
            if (danhSachTaiLieu[i].getClass().getSimpleName().toLowerCase().equals(loaiTaiLieu.toLowerCase())) {
                System.out.println(i + 1 + ": " + danhSachTaiLieu[i]);
            }

        }
        System.out.println("------------------------------");
    }

    public void hienThiThongTin() {
        if (this.soLuongTaiLieu > 0) {
            System.out.println("------------------------------");
            for (int i = 0; i < soLuongTaiLieu; i++) {
                System.out.println(danhSachTaiLieu[i]);
                System.out.println("------------------------------");
            }

        } else {
            System.out.println("Danh sach rong");
            System.out.println("------------------------------");
        }
    }
}
