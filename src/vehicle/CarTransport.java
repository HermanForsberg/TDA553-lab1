package vehicle;
import java.awt.*;
import java.util.Stack;

import flatbed.TwoStateFlatbed;
import load.Load;

public class CarTransport extends Vehicle implements Load{
    private TwoStateFlatbed flatbed;
    private int maxNumberOfCarsLoaded;
    private Stack<Car> carStack;

    public CarTransport(int nrDoors, double enginePower, double currentSpeed, Color color, int maxNumberOfCarsLoaded){
        super(nrDoors, enginePower, currentSpeed, color); 
        this.flatbed = new TwoStateFlatbed();   
        this.maxNumberOfCarsLoaded = Math.max(maxNumberOfCarsLoaded, 1);  
        this.carStack = new Stack<Car>();
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

    @Override
    public void load(Car car) { //You can only load cars.
        if (canLoadCar(car)){
            car.setLoaded(true);
            this.carStack.push(car);
        }
    }

    @Override
    public void unload(Car car) { //You can only load cars.
        if (canUnloadCar(car)) {
            carStack.pop();
            car.setLoaded(false);
        }
    }

    private boolean canLoadCar(Car car) {
        return (
            (carStackNotFull(car)) && 
            (distanceToCar(car) < 1) && 
            (carNotMoving(car)) && 
            (!flatbed.getFlatbedUp())
        );
    }
    
    private boolean canUnloadCar(Car car) {
        return (
            (!carStack.isEmpty()) && 
            (carStack.peek() == car) && 
            (flatbed.getFlatbedUp() == false)
        );
    }

    private double distanceToCar(Car car) {
        double distance;
        double xDifference = car.getX() - getX();
        double yDifference = car.getY() - getY();
        distance = Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
        return distance;
    }

    private boolean carNotMoving(Car car) {
        return (car.getDx() == 0) && (car.getDy() == 0);
    }

    private boolean carStackNotFull(Car car) {
        return carStack.size() < maxNumberOfCarsLoaded;
    }
}