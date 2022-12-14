import java.util.ArrayList;
import java.util.List;

import controller.Controller;
import model.StateOfGame;

import java.awt.*;
import vehicle.*;


public class Main {
public static void main(String[] args) {
    List<Vehicle> vehicles = new ArrayList<>();
    vehicles.add(new Volvo240(4, 100, 0, Color.RED));
    vehicles.add(new Saab95(4, 100, 0, Color.YELLOW));
    vehicles.add(new Scania(4, 100, 0, Color.BLACK));
    StateOfGame state = new StateOfGame(vehicles);
    Controller controller = new Controller(state);
    

    System.out.println(state.getVehicles());
}

}
