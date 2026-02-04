package main.ass2;

public class HocSinh {
    private String hoTen;
    private Double diemToan;
    private Double diemVan;
    private Double diemAnh;
    public HocSinh(){

    }

    public HocSinh(String hoTen, Double diemToan, Double diemVan, Double diemAnh) {
        this.hoTen = hoTen;
        setDiemToan(diemToan);
        setDiemAnh(diemAnh);
        setDiemVan(diemVan);
    }

    public void setDiemToan(Double diemToan) {
        if (diemToan >= 0 && diemToan <= 10){
            this.diemToan = diemToan;
        }
    }

    public void setDiemVan(Double diemVan) {
        if (diemVan >= 0 && diemVan <= 10){
            this.diemVan = diemVan;
        }
    }

    public void setDiemAnh(Double diemAnh) {
        if (diemAnh >= 0 && diemAnh <= 10){
            this.diemAnh = diemAnh;
        }
    }

    public Double tinhDiemTb(){
        return (diemAnh + diemToan +diemVan)/3;
    }
    public String xepLoai(){
        if( tinhDiemTb() >=8){
            return "Gioi";
        } else if (tinhDiemTb() >= 6.5) {
            return"Kha";
        } else if (tinhDiemTb() >= 5) {
            return"Trung binh";
        }else {
            return"Yeu";
        }
    }
    //Hien thi
    public void hienThi(){
        System.out.println("Hoc sinh:"+hoTen);
        System.out.println("Diem TB:"+tinhDiemTb());
        System.out.println("Xep loai:"+ xepLoai());
    }
}
