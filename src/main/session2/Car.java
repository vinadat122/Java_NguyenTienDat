package main.session2;

public class Car {
    //attribute: thông tin của đối tượng
    String brand; //class variable
    Integer year;

    public Car(){ //hàm khởi tạo không tham số, giống tên lớp, ko có class
                  // tự động chạy khi khởi tạo object
        System.out.println("abc xyz...");
    }

    public Car(String brand, Integer year){ // hàm khởi tạo đầy đủ tham số
        this.brand = brand;
        this.year = year;
        System.out.println("test tự truyền tham số" +this.brand +this.year);
    }

    // method - behavior
    public  void run(){
        System.out.println(this.brand + "is running...");
    }

    public  void maintain(){
        System.out.println(this.brand  + "is maintaining.");
    }

    public boolean checkDate(){ // kiểm tra xem quá hạn 10 năm chưa
        int now = 2026;
        int yearP = this.year; //this là đối tượng ngầm định
        if (now - yearP > 10){
            return false;
        }else {
            return true;
        }
    }
}
