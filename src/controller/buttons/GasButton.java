package controller.buttons;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import controller.Spinner;
import model.StateOfGame;

public class GasButton extends JButton {
    private StateOfGame state;
    

    
    public GasButton(StateOfGame state, Spinner gasSpinner) {
        super("Gas");
        
        this.state = state;
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state.gas(gasSpinner.getGasAmount());
            }
        });
    }

    
}
