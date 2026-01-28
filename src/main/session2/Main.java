package main.session2;

public class Main {

    public static void main (String[] args){
        //chương trình này chạy, bản thân class Car ko chạy
        Car c = new Car();
        //tạo ra 1 object "c" từ class Car (Car như 1 loại kiểu dữ liệu int, double,...)
        c.brand = "Toyota";
        c.year = 2020;
        c.run();
        c.maintain();

        System.out.println("Hãng xe:"+c.brand);

        boolean check = c.checkDate();
        if(check){
            System.out.println("xe còn hạn");
        }else {
            System.out.println("xe hết hạn");
        }
        Car b = new Car("Bmw",2009);

    }
}
