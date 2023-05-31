package javacb.btvn.oop.bt4;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance(new Locale("vi", "VN"));
        Account taiKhoan1 = new Account(77777, "Le Tran Tan Tai");
        Account taiKhoan2 = new Account(23511, "Vo Danh");

        // Thực hiện nạp tiền vào tài khoản
        System.out.println("Tai khoan " + taiKhoan1.getTenTaiKhoan() + " truoc khi nap tien la: "
                + numberFormat.format(taiKhoan1.getSoTienTrongTaiKhoan()) + " VND");
        taiKhoan1.napTienVaoTaiKhoan(100000000);
        System.out.println("Tai khoan " + taiKhoan1.getTenTaiKhoan() + " sau khi nap 100000000 la: "
                + numberFormat.format(taiKhoan1.getSoTienTrongTaiKhoan()) + " VND");

        // Thực hiện rút tiền
        taiKhoan1.rutTien(300000);
        System.out.println("Tai khoan " + taiKhoan1.getTenTaiKhoan() + " sau khi rut 300000 la: "
                + numberFormat.format(taiKhoan1.getSoTienTrongTaiKhoan()) + " VND");

        // Thực hiện chuyển khoản
        taiKhoan1.chuyenKhoan(taiKhoan2, 7000000);
        System.out.println("Tai khoan " + taiKhoan1.getTenTaiKhoan() + " sau khi chuyen 7000000 cho "
                + taiKhoan2.getTenTaiKhoan() + " la: "
                + numberFormat.format(taiKhoan1.getSoTienTrongTaiKhoan()) + " VND");

        System.out.println();

        // Xuất thông tin 2 tài khoản
        System.out.println("Thong tin tai khoan: ");
        System.out.println(taiKhoan1);
        System.out.println("==========================");
        System.out.println(taiKhoan2);

    }

}
