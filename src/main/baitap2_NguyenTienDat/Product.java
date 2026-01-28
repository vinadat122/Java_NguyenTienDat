package main.baitap2_NguyenTienDat;

public class Product {
    private String productld;
    private String name;
    private Double price;

    public Product(){

    }

    public Product(String productld, String name, Double price) {
        this.productld = productld;
        this.name = name;
        this.price = price;
    }
//setting
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setProductld(String productld) {
        this.productld = productld;
    }

    //getting
    public String getProductld(){
        return  productld;
    }
    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }

    //getInfor
    public String getInfor(){
        return "Name:"+getName()+
                "Productld:"+getProductld()+
                "Price:"+calculateDiscountedPrice();
    }
    //calculateDiscountedPrice
    public Double calculateDiscountedPrice(){
        return price*0.9;
    }
}
