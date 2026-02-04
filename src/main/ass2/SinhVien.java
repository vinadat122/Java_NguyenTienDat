package main.ass2;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private int tuoi;
    private Double diemTB;

    public SinhVien(){}
    public SinhVien(String maSV, String hoTen, int tuoi, Double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(Double diemTB) {
        this.diemTB = diemTB;
    }

    public String inThongtin(){
        return "msv:"+getMaSV() + ", Ten: "+getHoTen() + ", Tuoi: "+getTuoi() + ", Diem trung binh: "+getDiemTB();

    }
}
