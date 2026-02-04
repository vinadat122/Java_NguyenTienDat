package main.ass2;

public class TaiKhoan {
    private String soTaiKhoan;
    private String tenChuTK;
    private Double soDu;

    public TaiKhoan(String soTaiKhoan, String tenChuTK, Double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTK = tenChuTK;
        this.soDu = soDu;
    }
    public void rutTien(Double soTien) {
        if (soTien > soDu) {
            System.out.println("Khong the rut qua so du!");
            return;
        }
        soDu -= soTien;
        System.out.println("Rut tien thanh cong!");
    }

    public void napTien(Double soTien) {
        if (soTien <= 0) {
            System.out.println("Phai nap so tien > 0");
            return;
        }
        soDu += soTien;
        System.out.println("Nap tien thanh cong!");
    }

    public void hienThi() {
        System.out.println("So TK: " + soTaiKhoan);
        System.out.println("Chu TK: " + tenChuTK);
        System.out.println("So du: " + soDu);
    }
}
