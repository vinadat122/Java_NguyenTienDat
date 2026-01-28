package main.baitap2_NguyenTienDat;

public class ElectronicProduct extends Product{
    private Integer warrantyMonths;

    public ElectronicProduct(String productld, String name, Double price, Integer warrantyMonths) {
        super(productld, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public Integer getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(Integer warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    //getInfor
    public String getInfor(){

        return super.getInfor()+
                "Warranty:"+getWarrantyMonths();
    }
    public Double calculateDiscountedPrice(){
        Double price = getPrice();
        if(price > 10){
            price = price*0.9;
        }
        return price;
    }
}
