package controller;


import java.awt.*;
import javax.swing.JPanel;

import controller.buttons.*;
import model.StateOfGame;


public class Controller extends JPanel{
    //private JPanel controlPanel = new JPanel();
    private GasButton gasButton;
    private BrakeButton brakeButton;
    private TurboOffButton turboOffButton;
    private TurboOnButton turboOnButton;
    private RaiseBedButton raiseBedButton;
    private LowerBedButton lowerBedButton;
    private StartButton startButton;
    private StopButton stopButton;
    private StateOfGame state;
    private GasPanel gasPanel;

    public Controller(StateOfGame state) {
        this.state = state;
        this.gasButton = new GasButton(state);
        this.gasPanel = new GasPanel();
        }


    public void initComponents(){
        this.setLayout(new GridLayout(2,4));

        this.add(gasButton, 0);
        this.add(turboOnButton, 1);
        this.add(raiseBedButton, 2);
        this.add(brakeButton, 3);
        this.add(turboOffButton, 4);
        this.add(lowerBedButton, 5);
        this.setPreferredSize(new Dimension(304, 200));
        this.setBackground(Color.CYAN);

        startButton.setBackground(Color.blue);
        startButton.setForeground(Color.green);
        startButton.setPreferredSize(new Dimension(600/5-15,200));
        this.add(startButton);

        stopButton.setBackground(Color.red);
        stopButton.setForeground(Color.black);
        stopButton.setPreferredSize(new Dimension(600/5-15,200));
        this.add(stopButton);

    }

}
