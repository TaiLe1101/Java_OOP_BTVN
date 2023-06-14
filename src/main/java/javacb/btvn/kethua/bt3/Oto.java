package javacb.btvn.kethua.bt3;

class Oto extends PhuongTienGiaoThong {
    private int soChoNgoi;
    private String kieuDongCo;

    public Oto() {
        super();
        kieuDongCo = "";
    }

    public Oto(String id, String hangSanXuat, int namSanXuat, double giaBan, String mauXe, int soChoNgoi,
            String kieuDongCo) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    @Override
    public String toString() {
        return "Oto:\n" +
                super.toString() +
                "\nSo cho ngoi: " + soChoNgoi +
                "\nKieu dong co: " + kieuDongCo;
    }

}