package javacb.btvn.oop.bt5;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
        this.tuSo = 1;
        this.mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        if (mauSo != 0) {
            this.mauSo = mauSo;
        } else {
            System.out.println("Mau so khong hop le. Vui long nhap lai.");
        }
    }

    private int timUCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return timUCLN(b, a % b);
    }

    public void toiGian() {
        int ucln = timUCLN(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;
    }

    public PhanSo nghichDao() {
        if (tuSo != 0) {
            return new PhanSo(mauSo, tuSo);
        } else {
            System.out.println("Khong the nghich dao phan so. Phan so hien tai co tu so bang 0.");
            return null;
        }
    }

    public PhanSo cong(PhanSo phanSo) {
        int tuSoMoi = tuSo * phanSo.mauSo + mauSo * phanSo.tuSo;
        int mauSoMoi = mauSo * phanSo.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }

    public PhanSo tru(PhanSo phanSo) {
        int tuSoMoi = tuSo * phanSo.mauSo - mauSo * phanSo.tuSo;
        int mauSoMoi = mauSo * phanSo.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }

    public PhanSo nhan(PhanSo phanSo) {
        int tuSoMoi = tuSo * phanSo.tuSo;
        int mauSoMoi = mauSo * phanSo.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }

    public PhanSo chia(PhanSo phanSo) {
        if (phanSo.tuSo != 0) {
            int tuSoMoi = tuSo * phanSo.mauSo;
            int mauSoMoi = mauSo * phanSo.tuSo;
            return new PhanSo(tuSoMoi, mauSoMoi);
        } else {
            System.out.println("Khong the chia cho 0. Vui long nhap lai phan so.");
            return null;
        }
    }

    public boolean equals(PhanSo phanSo) {
        double giaTri1 = (double) tuSo / mauSo;
        double giaTri2 = (double) phanSo.tuSo / phanSo.mauSo;
        double saiSo = 0.0001;
        return Math.abs(giaTri1 - giaTri2) <= saiSo;
    }

    public void nhapPhanSo() {
        Scanner scNumber = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        int tuSo = scNumber.nextInt();
        System.out.print("Nhap mau so: ");
        int mauSo = scNumber.nextInt();
        this.tuSo = tuSo;
        if (mauSo != 0) {
            this.mauSo = mauSo;
        } else {
            System.out.println("Mau so khong hop le. Mau so mac dinh duoc su dung.");
        }
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}
