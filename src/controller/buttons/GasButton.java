package controller.buttons;

import vehicle.Vehicle;
import StateOfGame;

public class GasButton {
    StateOfGame state;
    void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Vehicle vehicle : state
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
