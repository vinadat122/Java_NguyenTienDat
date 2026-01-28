package main.baitap2_NguyenTienDat;

public class FoodProduct extends Product{
    private Integer expiryDays;

    public FoodProduct(String productld, String name, Double price, Integer expiryDays) {
        super(productld, name, price);
        this.expiryDays = expiryDays;
    }

    public Integer getExpiryDays() {
        return expiryDays;
    }

    public void setExpiryDays(Integer expiryDays) {
        this.expiryDays = expiryDays;
    }

    //getInfor
    public String getInfor(){

        return super.getInfor()+
                "Expiry:"+getExpiryDays();
    }
    public Double calculateDiscountedPrice(){

        if(getExpiryDays() <= 3){
            return getPrice()*0.7;
        } else if (getExpiryDays() <= 7) {
            return getPrice() * 0.9;
        }
        return getPrice();
    }

}
