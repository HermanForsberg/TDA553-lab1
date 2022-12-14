package controller;

import javax.swing.JPanel;

import controller.buttons.*;
import model.StateOfGame;


public class Controller {
    private JPanel controlPanel = new JPanel();
    private GasButton gasButton;
    private StateOfGame state;

    public Controller(StateOfGame state) {
        this.state = state;
        this.gasButton = new GasButton(state);
    }


    private void initComponents(){
        controlPanel.setLayout(new GridLayout(2,4));

        controlPanel.add(gasButton, 0);
        controlPanel.add(turboOnButton, 1);
        controlPanel.add(liftBedButton, 2);
        controlPanel.add(brakeButton, 3);
        controlPanel.add(turboOffButton, 4);
        controlPanel.add(lowerBedButton, 5);
        controlPanel.setPreferredSize(new Dimension((X/2)+4, 200));
        this.add(controlPanel);
        controlPanel.setBackground(Color.CYAN);
    }

}
