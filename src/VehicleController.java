import javax.swing.*;


import vehicle.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class VehicleController {
    // member fields:

    // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.
    private Timer timer = new Timer(delay, new TimerListener());

    // The frame that represents this instance View of the MVC pattern
    VehicleView frame;
    // A list of cars, modify if needed
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    //methods:

    //Move to Main/APP
    public static void main(String[] args) {
        // Instance of this class
        VehicleController vc = new VehicleController();

        vc.vehicles.add(new Volvo240(4, 100, 0, Color.RED));
        vc.vehicles.add(new Saab95(4, 100, 0, Color.YELLOW));
        vc.vehicles.add(new Scania(4, 100, 0, Color.BLACK));

        // Start a new view and send a reference of self
        vc.frame = new VehicleView("VehicleSim 1.0", vc);

        // Start the timer
        vc.timer.start();
    }

    /* Each step the TimerListener moves all the cars in the list and tells the
    * view to update its images. Change this method to your needs.
    * */

    //Should be in Update
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicle vehicle : vehicles) {
                vehicle.move();
                int x = (int) Math.round(vehicle.getX());
                int y = (int) Math.round(vehicle.getY());
                frame.drawPanel.moveit(x, y);
                // repaint() calls the paintComponent method of the panel
                frame.drawPanel.repaint();
            }
        }
    }

    //Sholud be in Controller
    // Calls the gas method for each car once
    void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Vehicle vehicle : vehicles
                ) {
            vehicle.gas(gas);
        }
    }
}
