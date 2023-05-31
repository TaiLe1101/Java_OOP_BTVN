package javacb.btvn.oop.bt8;

public class CD {
    private int maCD;
    private String tuaCD;
    private String caSy;
    private int soBaiHat;
    private double giaThanh;

    public CD() {
    }

    public CD(int maCD, String tuaCD, String caSy, int soBaiHat, double giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    public int soSanhTuaCD(String tuaCD1, String tuaCD2) {
        int minLength = Math.min(tuaCD1.length(), tuaCD2.length());

        for (int i = 0; i < minLength; i++) {
            char char1 = tuaCD1.charAt(i);
            char char2 = tuaCD2.charAt(i);

            if (char1 != char2) {
                return char1 - char2;
            }
        }

        return tuaCD1.length() - tuaCD2.length();
    }

    @Override
    public String toString() {
        return "Ma CD: " + maCD +
                "\nTua CD: " + tuaCD +
                "\nCa sy: " + caSy +
                "\nSo bai hat: " + soBaiHat +
                "\nGia thanh: " + giaThanh;
    }

}
