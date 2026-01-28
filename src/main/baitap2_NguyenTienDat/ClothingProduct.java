package main.baitap2_NguyenTienDat;

public class ClothingProduct extends Product{
    private String size;

    public ClothingProduct(String productld, String name, Double price, String size) {
        super(productld, name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    //getInfor
    public String getInfor(){

        return super.getInfor()+
                "Size:"+getSize();
    }
    public Double calculateDiscountedPrice(){
        return getPrice()*0.9;
    }
}
