package load;
import vehicle.Car;

public abstract class Load{
    public abstract void load(Car car);
    public abstract void unload(Car car);

    public double distanceToCar(Car car, double x, double y){
        double distance;
        double xDifference = car.getX() - x;
        double yDifference = car.getY() - y;
        distance = Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
        return distance;
    }

}
