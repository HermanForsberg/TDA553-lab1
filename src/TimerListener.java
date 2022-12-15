
import java.util.List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vehicle.*;
import view.ViewVehicle;

public class TimerListener implements ActionListener {
    private List<Vehicle> vehicles;
    private ViewVehicle view;
    

    public TimerListener(List<Vehicle> vehicles, ViewVehicle view){
        this.vehicles = vehicles;
        this.view = view;
    }
    @Override
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
