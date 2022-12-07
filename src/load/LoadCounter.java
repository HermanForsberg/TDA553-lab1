package load;
import vehicle.Car;

public class LoadCounter extends Load{
    private int maxNumberOfCarsLoaded;
    private int currentNumberOfCarsLoaded;
    

    public LoadCounter(int maxNumberOfCarsLoaded) {
        this.maxNumberOfCarsLoaded = Math.max(maxNumberOfCarsLoaded, 1);
        this.currentNumberOfCarsLoaded = 0;
    }

    public void load(Car car) {
        if ((currentNumberOfCarsLoaded < maxNumberOfCarsLoaded)) {
            car.setLoaded(true);
            currentNumberOfCarsLoaded += 1;
        }
    }

    public void unload(Car car) {
        if (currentNumberOfCarsLoaded > 0){
            car.setLoaded(false);
            currentNumberOfCarsLoaded -= 1;
        }
    }

    public int getCurrentNumberOfCars() {
        return currentNumberOfCarsLoaded;
    }

    public int getMaxNumberOfCars(){
        return maxNumberOfCarsLoaded;
    }
}
