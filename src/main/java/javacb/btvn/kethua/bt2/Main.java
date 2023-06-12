package javacb.btvn.kethua.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh(10);
        Scanner sc = new Scanner(System.in);

        // Thêm mới thí sinh
        ThiSinh thiSinh1 = new ThiSinhKhoiA("Le Tran Tan Tai", "Ha Noi", 1);
        ThiSinh thiSinh2 = new ThiSinhKhoiB("Le Tran Tan Tai 2", "Ho Chi Minh", 2);
        ThiSinh thiSinh3 = new ThiSinhKhoiC("Le Tran Tan Tai 3", "Da Nang", 3);

        tuyenSinh.themMoiThiSinh(thiSinh1);
        tuyenSinh.themMoiThiSinh(thiSinh2);
        tuyenSinh.themMoiThiSinh(thiSinh3);

        // Hiển thị thông tin
        tuyenSinh.hienThiThongTin();

        // Tìm kiếm theo số báo danh
        System.out.print("Nhap so bao danh can tim: ");
        String soBaoDanh = sc.nextLine();

        System.out.println("-------------------------------");
        tuyenSinh.timKiemTheoSoBaoDanh(soBaoDanh);
    }
}