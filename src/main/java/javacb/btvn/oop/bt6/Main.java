package javacb.btvn.oop.bt6;

public class Main {
    public static void main(String[] args) {
        HangThucPham hang1 = new HangThucPham("H001", "Gao", 25000.0, "10/05/2023", "31/12/2023");
        HangThucPham hang2 = new HangThucPham("H002");
        hang2.setTenHang("Mi tom");
        hang2.setDonGia(8000.0);
        hang2.setNgaySanXuat("01/06/2023");
        hang2.setNgayHetHan("29/05/2023");

        System.out.println("Thong tin hang 1:");
        System.out.println(hang1.toString());
        System.out.println("Da het han hay chua?: " + (hang1.daHetHan() ? "Da het han" : "Chua het han"));

        System.out.println("\nThong tin hang 2:");
        System.out.println(hang2.toString());
        System.out.println("Da het han hay chua?: " + (hang2.daHetHan() ? "Da het han" : "Chua het han"));
    }
}
