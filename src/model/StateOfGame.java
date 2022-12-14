package model;
import java.util.ArrayList;
import java.util.List;


import vehicle.Vehicle;

public class StateOfGame{

    private List<Vehicle> vehicles = new ArrayList<>(); 

    public StateOfGame(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Vehicle vehicle : vehicles
                ) {
            vehicle.gas(gas);
        }
    }


    
}

