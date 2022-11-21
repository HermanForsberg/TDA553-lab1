
import java.awt.*;
//import javax.management.loading.PrivateClassLoader;

public abstract class Car implements Movable {
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private double direction;
    private double x;
    private double y;
    private double dx;
    private double dy;
    // private String modelName; // The car model name

    public Car(int nrDoors, double enginePower, double currentSpeed, Color color) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.direction = 0;
        this.x = 0;
        this.y = 0;
        this.dx = 0;
        this.dy = 0;
        // this.modelName = modelName;
    }

    public int getNrDoors() {
        return nrDoors;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setnrDoors(int nrDoors) {
        this.nrDoors = nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    abstract void incrementSpeed(double amount);

    abstract void decrementSpeed(double amount);

    public void setDx() {
        this.dx = this.getCurrentSpeed() * Math.cos(Math.toRadians(direction));
    }

    public void setDy() {
        this.dy = this.getCurrentSpeed() * Math.sin(Math.toRadians(direction));
    }

    @Override
    public void move() {
        this.x += this.dx;
        this.y += this.dy;
    }

    @Override
    public void turnRight() {
        this.direction -= 1;
        this.direction %= 360;
    }

    @Override
    public void turnLeft() {
        this.direction += 1;
        this.direction %= 360;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDx() {
        return dx;
    }
    
    public double getDy() {
        return dy;
    }

    public double getDirection() {
        return direction;
    }
    /*
     * The car classes' methods currently have no way of controlling by how much the
     * speed can be increased or decreased. Rewrite the methods so that:
     * 
     * gas() and brake() only accept values in the interval [0,1],
     * currentSpeed always lies in the interval [0 , enginePower],
     * calls to gas() cannot result in the speed decreasing, and
     * calls to brake() cannot result in the speed increasing.
     */

    public void gas(double gas){
        if((0 <= gas) && (gas <= 1) && (this.currentSpeed <= this.enginePower)) { 
            incrementSpeed(gas);
        }
    }
    public void brake(double brake){
        if((0 <= brake) && (brake <= 1) && (this.currentSpeed >= 0)){ 
            decrementSpeed(brake);
        }
    }   

}
