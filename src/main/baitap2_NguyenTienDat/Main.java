package main.baitap2_NguyenTienDat;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //Product list
        ArrayList<Product> productList = new ArrayList<>();
        productList.add( new ElectronicProduct("1","television",5.0,12));
        productList.add( new ClothingProduct("2","shirt",1.0,"M"));
        productList.add( new FoodProduct("3","CAKE",0.1,3));

        for (Product p: productList){
            System.out.println(p.getInfor());
        }
    }
}
