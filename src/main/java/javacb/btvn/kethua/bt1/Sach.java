package javacb.btvn.kethua.bt1;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach() {
        super();
        this.tenTacGia = "";
        this.soTrang = 1;
    }

    public Sach(String maTaiLieu, String tenNhaSanXuat, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaSanXuat, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach: "
                + super.toString() +
                "\n\t- Ten tac gia: " + this.tenTacGia +
                "\n\t- So trang: " + this.soTrang;
    }

}
