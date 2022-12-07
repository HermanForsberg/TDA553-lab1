package repairShop;
import load.LoadCounter;
import vehicle.Car;

public class CarRepairShop {
    private double x;
    private double y;
    private LoadCounter load;

    public CarRepairShop(int maxNumberOfCarsLoaded, int currentNrOfCars, double x, double y){
        this.x = x;
        this.y = y;
    }

    public void load(Car car) { //You can only load cars.
        if ((load.distanceToCar(car, x, y) < 1)){
            load.load(car);
        }
    }

    
    public void unload(Car car) { //You can only load cars.
        load.unload(car);
    }

}
