package main.session1;

import java.util.ArrayList;

public class Demo2 {
    public static void main (String[] args){

        int[] arr = new int[]{1,2}; // khai báo 1 mảng int

        //list - collection không cần thiết phải nằm cạnh nhau
        // các kiểu int float, double,.. ko dùng được
        Integer a = 10; //giống int, viết hoa các chữ đầu
        Float b = 3.14f;
        Double c = 3.14159;
        Character h = 'x';
        Boolean t = true;
        ArrayList ar = new ArrayList(); // không nên dùng
        ar.add(5);
        ar.add("hello");

        ArrayList<Integer> intArr  = new ArrayList<>(); // mảng số nguyên
        intArr.add(3);
        intArr.add(5);
       // intArr.add("hello"); không thêm được do không phải int.
        for(int i=0; i<intArr.size();i++){
            System.out.println(intArr.get(i)); //intArr.get(i) lấy phần tử i
        }

        ArrayList<Double> dbArr = new ArrayList<>(); // mảng số thực

        for (Double d: dbArr){  //giống foreach php viết ngắn hơn cách trên
            System.out.println(d);
        }
    }
}
