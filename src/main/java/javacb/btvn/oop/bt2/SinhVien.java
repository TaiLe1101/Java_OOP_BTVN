package javacb.btvn.oop.bt2;

public class SinhVien {
    private int maSV;
    private String hoTenSV;
    private float diemLT, diemTH;

    // Tạo phương thức khởi tạo không tham số
    public SinhVien() {
        this.hoTenSV = "";
    }

    // Tạo phương thức khởi tạo có đầy đủ tham số
    public SinhVien(int maSV, String hoTenSV, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTenSV = hoTenSV;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    // Tạo các phương thức Getter, Setter
    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTenSV() {
        return hoTenSV;
    }

    public void setHoTenSV(String hoTenSV) {
        this.hoTenSV = hoTenSV;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    // Tạo các phương thức tính toán (Logic)
    public float tinhDiemTrungBinh() {
        return (this.diemLT + this.diemTH) / 2;
    }

    public void xuatThongTin() {
        System.out.printf("%d \t %-30s \t %5.2f \t %5.2f \t %5.2f", this.maSV, this.hoTenSV, this.diemLT, this.diemTH,
                this.tinhDiemTrungBinh());
    }

    // Ghi đè phương thức toString của lớp tổ tiên
    @Override
    public String toString() {
        return "- Ma: " + this.maSV + "\n- Ho ten: " + this.hoTenSV + "\n- Diem LT: " + this.diemLT + "\n- Diem TH: "
                + this.diemTH + "\n- Diem TB: " + this.tinhDiemTrungBinh();
    }
}
