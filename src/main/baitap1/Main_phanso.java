package main.baitap1;

import java.util.Scanner;

public class Main_phanso {
    public static void main(String[] args) {

        Phanso f1 = new Phanso();
        Phanso f2 = new Phanso();

        System.out.println("Nhap phan so thu 1:");
        f1.nhap();

        System.out.println("Nhap phan so thu 2:");
        f2.nhap();

        f1.rutGon();
        System.out.print("Phan so 1: ");
        f1.hienThi();

        f2.rutGon();
        System.out.print("Phan so 1: ");
        f2.hienThi();
    }

}