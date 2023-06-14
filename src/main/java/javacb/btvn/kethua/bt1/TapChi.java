package javacb.btvn.kethua.bt1;

public class TapChi extends TaiLieu {
    private int soPhatHanh, thangPhatHanh;

    public TapChi() {
        super();
        this.soPhatHanh = 1;
        this.thangPhatHanh = 1;
    }

    public TapChi(String maTaiLieu, String tenNhaSanXuat, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNhaSanXuat, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "Tap chi: " +
                super.toString() +
                "\n\t- So phat hanh: " + this.soPhatHanh +
                "\n\t- Thang phat hanh: " + this.thangPhatHanh;
    }

}
