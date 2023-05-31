package javacb.btvn.oop.bt5;

public class Main {
    public static void main(String[] args) {
        PhanSo phanSo1 = new PhanSo();
        PhanSo phanSo2 = new PhanSo();

        System.out.println("Nhap phan so 1: ");
        phanSo1.nhapPhanSo();

        System.out.println("Nhap phan so 2: ");
        phanSo2.nhapPhanSo();

        System.out.println();

        System.out.println("phan so 1: " + phanSo1);
        System.out.println("phan so 2: " + phanSo2);

        System.out.println();

        phanSo1.toiGian();
        System.out.println("Phan so 1 sau khi toi gian: " + phanSo1);

        phanSo2.toiGian();
        System.out.println("Phan so 2 sau khi toi gian: " + phanSo2);

        System.out.println();

        System.out.println("Cong 2 phan so co ket qua la: " + phanSo1.cong(phanSo2));
        System.out.println("Tru 2 phan so co ket qua la: " + phanSo1.tru(phanSo2));
        System.out.println("Nhan 2 phan so co ket qua la: " + phanSo1.nhan(phanSo2));
        System.out.println("Chia 2 phan so co ket qua la: " + phanSo1.chia(phanSo2));
        System.out.println(
                "So sanh 2 phan so co ket qua la: " + (phanSo1.equals(phanSo2) ? "Giong nhau" : "Khong giong nhau"));
    }
}
