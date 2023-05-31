package javacb.btvn.oop.bt1;

public class HinhChuNhat {
    private double chieuDai, chieuRong;

    // Phương thức Getter, Setter
    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    // Phương thức xử lý logic
    public double tinhChuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public double tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    // Override phương thức toString
    @Override
    public String toString() {
        return "- Chieu dai: " + this.chieuDai + "\n- Chieu Rong: " + this.chieuRong + "\n- Chu Vi: " + this.tinhChuVi()
                + "\n- Dien Tich: " + this.tinhDienTich();
    }

}
