package javacb.btvn.kethua.bt2;

class TuyenSinh {
    private ThiSinh[] danhSachThiSinh;
    private int soLuongThiSinh;

    public TuyenSinh(int maxSize) {
        danhSachThiSinh = new ThiSinh[maxSize];
        soLuongThiSinh = 0;
    }

    public void themMoiThiSinh(ThiSinh thiSinh) {
        if (soLuongThiSinh < danhSachThiSinh.length) {
            danhSachThiSinh[soLuongThiSinh] = thiSinh;
            soLuongThiSinh++;
            System.out.println("Them moi thi sinh thanh cong.");
        } else {
            System.out.println("Danh sach thi sinh da day, khong the them moi.");
        }
    }

    public void hienThiThongTin() {
        for (int i = 0; i < soLuongThiSinh; i++) {
            ThiSinh thiSinh = danhSachThiSinh[i];
            System.out.println(thiSinh);
            if (thiSinh instanceof ThiSinhKhoiA) {
                ThiSinhKhoiA thiSinhKhoiA = (ThiSinhKhoiA) thiSinh;
                System.out.println("Khoi thi: A");
                System.out.println("Mon thi: " + String.join(", ", thiSinhKhoiA.getMonHoc()));
            } else if (thiSinh instanceof ThiSinhKhoiB) {
                ThiSinhKhoiB thiSinhKhoiB = (ThiSinhKhoiB) thiSinh;
                System.out.println("Khoi thi: B");
                System.out.println("Mon thi: " + String.join(", ", thiSinhKhoiB.getMonHoc()));
            } else if (thiSinh instanceof ThiSinhKhoiC) {
                ThiSinhKhoiC thiSinhKhoiC = (ThiSinhKhoiC) thiSinh;
                System.out.println("Khoi thi: C");
                System.out.println("Mon thi: " + String.join(", ", thiSinhKhoiC.getMonHoc()));
            }
            System.out.println("---------------------");
        }
    }

    public void timKiemTheoSoBaoDanh(String soBaoDanh) {
        for (int i = 0; i < soLuongThiSinh; i++) {
            ThiSinh thiSinh = danhSachThiSinh[i];
            if (thiSinh.getSoBaoDanh().equals(soBaoDanh)) {
                System.out.println(thiSinh);
                if (thiSinh instanceof ThiSinhKhoiA) {
                    System.out.println("Khoi thi: A");
                } else if (thiSinh instanceof ThiSinhKhoiB) {
                    System.out.println("Khoi thi: B");
                } else if (thiSinh instanceof ThiSinhKhoiC) {
                    System.out.println("Khoi thi: C");
                }
                return;
            }
        }
        System.out.println("Khong tim thay thi sinh co so bao danh " + soBaoDanh);
    }
}