package controller.buttons;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import controller.Spinner;
import model.StateOfGame;

public class GasButton extends JButton {
    JButton gasButton = new JButton("Gas");
    StateOfGame state;
    Spinner spinner;

    
    public GasButton(StateOfGame state) {
        this.state = state;
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state.gas(spinner.getGasAmount());
            }
        });
    }

    
}
