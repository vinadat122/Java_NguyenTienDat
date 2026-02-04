package main.ass4;

import java.util.ArrayList;

public class Main_Vehicle {
    public static void main(String[] args){
        ArrayList <Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Train());
        vehicles.add(new Plane());

        for (Vehicle v: vehicles){
            v.Move();
        }
    }
}
