package vehicle;
import java.awt.*;

import flatbed.TwoStateFlatbed;
import load.LoadStack;

public class CarTransport extends Truck {
    private TwoStateFlatbed flatbed;
    private LoadStack load;

    public CarTransport(int nrDoors, double enginePower, double currentSpeed, Color color, int maxNumberOfCarsLoaded){
        super(nrDoors, enginePower, currentSpeed, color); 
        this.flatbed = new TwoStateFlatbed(); 
        this.load = new LoadStack(maxNumberOfCarsLoaded);
    }

    @Override
    public void startEngine() {
        if (flatbed.getFlatbedUp() == true) {
            super.startEngine(); 
        }
    }

    @Override
    public void gas(double gas){
        if (flatbed.getFlatbedUp() == true) {
            super.gas(gas); 
        }
    }

    public void raise() {
        if (getCurrentSpeed() == 0) {
            flatbed.raise();
        }
    }

    public void lower() {
        if (getCurrentSpeed() == 0) {
            flatbed.lower();
        }
    }

    public void load(Car car) { //You can only load cars.
        if (
            (load.distanceToCar(car, getX(), getY()) < 1) && 
            (!flatbed.getFlatbedUp())) {
            load.load(car);
        }
    }

    public void unload(Car car) { //You can only load cars.
        if ((flatbed.getFlatbedUp() == false)) {
            load.unload(car);
        }
    }




}