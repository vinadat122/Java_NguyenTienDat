package main.ASS4_NguyenTienDat;

public class Bike extends Vehicle{
    public Bike(Double maxSpeed, String name) {
        super(maxSpeed, name);
    }

    @Override
    public void Move() {
        System.out.println("Bike is riding");
    }
}
