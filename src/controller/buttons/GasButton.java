package controller.buttons;

import vehicle.Vehicle;

public class GasButton {
    
    void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Vehicle vehicle : getVehicles()
                ) {
            vehicle.gas(gas);
        }
    }

    gasButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            vehicleC.gas(gasAmount);
        }
    });
}
