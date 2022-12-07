package load;
import java.util.Stack;

import vehicle.Car;


public class LoadStack extends Load {
    private int maxNumberOfCarsLoaded;
    private Stack<Car> carStack;

    public LoadStack(int maxNumberOfCarsLoaded) {
        this.maxNumberOfCarsLoaded = Math.max(maxNumberOfCarsLoaded, 1);  
        this.carStack = new Stack<Car>();
    }

    public void load(Car car){
        if ((carStackNotFull()) &&
            (carNotMoving(car))){
            car.setLoaded(true);
            carStack.push(car);
        }
    }

    public void unload(Car car){
        if ((!carStack.isEmpty()) && 
            (carStack.peek() == car)) {
            carStack.pop();
            car.setLoaded(false);
        }
    }

    private boolean carNotMoving(Car car) {
        return (car.getDx() == 0) && (car.getDy() == 0);
    }

    private boolean carStackNotFull() {
        return carStack.size() < maxNumberOfCarsLoaded;
    }

}
