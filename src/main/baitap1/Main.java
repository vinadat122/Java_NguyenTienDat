package main.baitap1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Integer a;
        Integer b;
        Integer c;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap canh a=");
        a = sc.nextInt();
        System.out.println("nhap canh b=");
        b = sc.nextInt();
        System.out.println("nhap canh c=");
        c = sc.nextInt();

        Tamgiac x = new Tamgiac(a,b,c);
        System.out.println("Chu vi tam giac la:" +x.Chuvi());
        System.out.println("Dien tich tam giac la:" +x.Dientich());
    }
}
