package javacb.btvn.oop.bt8;

public class DanhSachCD {
    private CD[] danhSachCD;
    private int count;

    public DanhSachCD(int capacity) {
        danhSachCD = new CD[capacity];
        count = 0;
    }

    public void themCD(CD cd) {
        if (count == danhSachCD.length) {
            System.out.println("Danh sach CD da day. Khong the them moi.");
            return;
        }

        for (int i = 0; i < count; i++) {
            if (danhSachCD[i].getMaCD() == cd.getMaCD()) {
                System.out.println("Ma CD da ton tai. Khong the them moi.");
                return;
            }
        }

        danhSachCD[count] = cd;
        count++;
        System.out.println("Them CD thanh cong.");
    }

    public int soLuongCD() {
        return count;
    }

    public double tongGiaThanh() {
        double tong = 0;
        for (int i = 0; i < count; i++) {
            tong += danhSachCD[i].getGiaThanh();
        }
        return tong;
    }

    public void sapXepTheoGiaThanhGiamDan() {
        quickSortGiaThanh(danhSachCD, 0, count - 1);
    }

    public void sapXepTheoTuaCDTangDan() {
        quickSortTuaCD(danhSachCD, 0, count - 1);
    }

    public void xuatDanhSachCD() {
        if (count == 0) {
            System.out.println("Danh sach CD rong.");
            return;
        }

        System.out.println("Danh sach CD:");
        for (int i = 0; i < count; i++) {
            System.out.println("CD " + (i + 1) + ":");
            System.out.println(danhSachCD[i].toString());
            System.out.println("--------------------");
        }
    }

    private void quickSortGiaThanh(CD[] arr, int low, int high) {
        if (low < high) {
            int pi = partitionGiaThanh(arr, low, high);

            quickSortGiaThanh(arr, low, pi - 1);
            quickSortGiaThanh(arr, pi + 1, high);
        }
    }

    private int partitionGiaThanh(CD[] arr, int low, int high) {
        double pivot = arr[high].getGiaThanh();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].getGiaThanh() >= pivot) {
                i++;

                CD temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        CD temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    private void quickSortTuaCD(CD[] arr, int low, int high) {
        if (low < high) {
            int pi = partitionTuaCD(arr, low, high);

            quickSortTuaCD(arr, low, pi - 1);
            quickSortTuaCD(arr, pi + 1, high);
        }
    }

    private int partitionTuaCD(CD[] arr, int low, int high) {
        String pivot = arr[high].getTuaCD();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].getTuaCD().compareTo(pivot) <= 0) {
                i++;

                CD temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        CD temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

}
