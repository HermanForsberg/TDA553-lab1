import java.util.ArrayList;
import java.util.List;

import javax.swing.Timer;

import controller.Controller;
import model.StateOfGame;

import java.awt.*;
import vehicle.*;
import view.ViewVehicle;


public class Main {
    private final static int delay = 50;
    
public static void main(String[] args) {
    List<Vehicle> vehicles = new ArrayList<>();
    vehicles.add(new Volvo240(4, 100, 0, Color.RED));
    vehicles.add(new Saab95(4, 100, 0, Color.YELLOW));
    vehicles.add(new Scania(4, 100, 0, Color.BLACK));
    StateOfGame state = new StateOfGame(vehicles);
    Controller controller = new Controller(state);
    ViewVehicle view = new ViewVehicle();
    view.add(controller);
    Timer timer = new Timer(delay, new TimerListener(vehicles, view));
    timer.start();
}




}
