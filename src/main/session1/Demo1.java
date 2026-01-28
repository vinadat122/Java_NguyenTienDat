package main.session1;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        int x = 10;
        float y = 3.14f;
        double z = 3.14159;
        boolean t = true;
        char c = 'h';
        String s = "heloo";

        System.out.println(s+x); //string + number ->string (giống JS)
        int u = 10;
        int v= 20;
        System.out.println(u+"+"+v+"="+add(u,v)); //dùng hàm add bên dưới
        System.out.println((u+"/"+v+"="+div(u,v))); //dùng hàm div bên dưới

        //nhập 1 số từ bàn phím
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        n = sc.nextInt();
        //kiểm tra phảo số nguyên tố không và đưa kết quả
        if(nguyen_to(n)){
            System.out.println(n+ "la so nguyen to");
        }else {
            System.out.println(n +"khong phai so nguyen to");
        }

        double p;
        p = sc.nextDouble();

    }

    public static int add(int a, int b){
        return a+b;
    }
    public static double div (int a, int b){
        if (b==0) return 0;
        return(double) a/b;
    }
    //kiểm tra 1 số phải số nguyên tố hay không
    public static boolean nguyen_to(int a){
        if(a<2){
            return false;
        }
        for(int i = 2; i<=a/2; i++){
            if(a%i==0) {
                return false;
            }
        }
        return true;
    }
}
