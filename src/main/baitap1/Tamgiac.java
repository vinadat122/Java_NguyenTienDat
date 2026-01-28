package main.baitap1;

import static java.lang.Math.sqrt;

public class Tamgiac {
    Integer a;
    Integer b;
    Integer c;

    public Tamgiac(){

    }
    public Tamgiac( Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
        public Integer Chuvi(){
            return a+b+c; // trong java cho phép viết a+b+c không cần this
        }
        public Double Dientich(){
            Double p = (a + b + c)/2.0;
            Double S = sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
            return S;
        }

}
