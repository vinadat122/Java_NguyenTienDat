package main.ASS4_NguyenTienDat;

public class Vehicle {
    private String name;
    private Double maxSpeed;

    public Vehicle(){}
    public Vehicle(Double maxSpeed, String name) {
        this.maxSpeed = maxSpeed;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void Move(){
        System.out.println("Vehicle is moving");
    }
}
