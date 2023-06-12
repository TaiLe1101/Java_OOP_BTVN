package javacb.btvn.kethua.bt1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bao extends TaiLieu {
    private Date ngayPhatHanh;

    public Bao() {
        super();
        this.ngayPhatHanh = new Date();
    }

    public Bao(String maTaiLieu, String tenNhaSanXuat, int soBanPhatHanh, Date ngayPhatHanh) {
        super(maTaiLieu, tenNhaSanXuat, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Date getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(Date ngayPhatHanh) {
        if (ngayPhatHanh == null) {
            this.ngayPhatHanh = new Date();
        } else {
            this.ngayPhatHanh = ngayPhatHanh;
        }
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Bao: " +
                super.toString() +
                "\n\t- Ngay phat hanh: " + dateFormat.format(this.ngayPhatHanh);
    }

}
