package controller.buttons;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import controller.Spinner;
import model.StateOfGame;

public class GasButton extends JButton {
    StateOfGame state;
    

    
    public GasButton(StateOfGame state, Spinner gasSpinner) {
        super("Gas");
        
        this.state = state;
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(gasSpinner.getGasAmount());
                state.gas(gasSpinner.getGasAmount());
                System.out.println("hej");
            }
        });
    }

    
}
