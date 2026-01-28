package main.baitap1;
import java.util.Scanner;

public class Phanso {
        private Integer tuso;
        private Integer mauso;

        //GETTER
    public Integer getTuso(){
        return tuso;
    }

    public Integer getMauso() {
        return mauso;
    }
    // SETTER

    public void setMauso(Integer mauso) {
        if (mauso != 0)
            this.mauso = mauso;
        else
            System.out.println("Mau so khong duoc bang 0!");
    }

    public void setTuso(Integer tuso) {
        this.tuso = tuso;
    }

    //Constructor
    public Phanso(){

    }
    public Phanso(Integer tuso, Integer mauso){
        this.tuso = tuso;
        this.mauso = mauso;
    }

    // ===== Nhập phân số =====
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        tuso = sc.nextInt();

        do {
            System.out.print("Nhap mau so (khac 0): ");
            mauso = sc.nextInt();
        } while (mauso == 0);
    }

    // ===== In phân số =====
    public void hienThi() {
        System.out.println(tuso + "/" + mauso);
    }

    // ===== Rút gọn =====
    private int UCLN(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return Math.abs(a);
    }

    public void rutGon() {
        int ucln = UCLN(tuso, mauso);
        tuso /= ucln;
        mauso /= ucln;
    }

    // ===== Nghịch đảo =====
    public Phanso nghichDao() {
        return new Phanso(mauso, tuso);
    }

}
