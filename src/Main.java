import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import controller.Controller;
import model.StateOfGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import vehicle.*;
import view.ViewVehicle;


public class Main {
    private final int delay = 50;
    
public static void main(String[] args) {
    List<Vehicle> vehicles = new ArrayList<>();
    vehicles.add(new Volvo240(4, 100, 0, Color.RED));
    vehicles.add(new Saab95(4, 100, 0, Color.YELLOW));
    vehicles.add(new Scania(4, 100, 0, Color.BLACK));
    StateOfGame state = new StateOfGame(vehicles);
    Controller controller = new Controller(state);
    ViewVehicle view = new ViewVehicle();
    Timer timer = new Timer(delay, new TimerListener(vehicles, view));

    System.out.println(state.getVehicles());
}



private class TimerListener implements ActionListener {
    private List<Vehicle> vehicles;
    private ViewVehicle view;
    

    public TimerListener(List<Vehicle> vehicles, ViewVehicle view){
        this.vehicles = vehicles;
        this.view = view;
    }

    public void actionPerformed(ActionEvent e) {
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            int x = (int) Math.round(vehicle.getX());
            int y = (int) Math.round(vehicle.getY());
            view.moveit(x, y);
            // repaint() calls the paintComponent method of the panel
            view.repaint();
        }
    }
}
}
