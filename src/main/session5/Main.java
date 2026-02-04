package main.session5;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        Asian a = new Asian();
        Euro e = new Euro();
        ArrayList<Person> arr = new ArrayList<>();
        arr.add(a);
        arr.add(e);
    }

    Person p = new Person() { //anonymous class - lop a danh, thuc ra la tao 1 lop ke thua lop person

        @Override
        public void eat() {

        }

        @Override
        public void sleep() {

        }

    };
    LoveTips lt = new LoveTips() {
        @Override
        public void dinner() {

        }

        @Override
        public void goTocoffee() {

        }
    };
    LoveSpecial ls = (s,y) ->{ //funtional interface viet the nay ngan hon - lambda expression

    };
    ArrayList<Integer> arrs  = new ArrayList<>();
    arrs.stream().filter(i-> i>0).map(i -> i<10).toArray();
}
