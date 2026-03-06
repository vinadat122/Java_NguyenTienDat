package main.practical_exam;

public class Product {
    private int id;
    private String name;
    private String thumbnail;
    private double price;
    private int qty;
    private String description;

    public Product() {
    }

//c
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 0){
            this.price = price;
        }else{
            System.out.println("Price cannot be negative");
        }
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        if(qty >= 0){
            this.qty = qty;
        }else{
            System.out.println("Quantity cannot be negative");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
//d
    public void displayInfo(){
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getQty());
        System.out.println("Description: " + getDescription());
    }

//2a
    public boolean checkAvailability(int orderQty){
        if(orderQty <= qty){
            return true;
        }
        return false;
    }
//2b
    public double placeOrder(int orderQty){
        if(checkAvailability(orderQty)){
            qty = qty - orderQty;
            return orderQty * price;
        }else{
            System.out.println("Not enough product in stock!");
            return 0;
        }
    }
}
