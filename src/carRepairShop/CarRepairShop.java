package carRepairShop;
import load.Load;
import vehicle.Car;

public class CarRepairShop {
    private int maxNumberOfCarsLoaded;
    private int currentNumberOfCarsLoaded;
    private double x;
    private double y;

    public CarRepairShop(int maxNumberOfCarsLoaded, int currentNrOfCars, double x, double y){
        this.maxNumberOfCarsLoaded = Math.max(maxNumberOfCarsLoaded, 1);
        this.currentNumberOfCarsLoaded = 0;
        this.x = x;
        this.y = y;
    }
    
    public int getCurrentNumberOfCars() {
        return currentNumberOfCarsLoaded;
    }

    public void setCurrentNumberOfCars(int currentNumberOfCarsLoaded) {
        this.currentNumberOfCarsLoaded = currentNumberOfCarsLoaded;
    }

    public int getMaxNumberOfCars(){
        return maxNumberOfCarsLoaded;
    }

    @Override
    public void load(Car car) { //You can only load cars.
        if ((currentNumberOfCarsLoaded < maxNumberOfCarsLoaded) && (distanceToCar(car, x, y) < 1)){
            currentNumberOfCarsLoaded += 1;
            car.setLoaded(true);
        }
    }

    @Override
    public void unload(Car car) { //You can only load cars.
        if (currentNumberOfCarsLoaded > 0){
            currentNumberOfCarsLoaded -= 1;
            car.setLoaded(false);
        }
    }

}
