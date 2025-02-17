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
    private Spinner spinner;

    public Controller(StateOfGame state) {
        this.state = state;
        this.spinner = new Spinner();
        this.gasButton = new GasButton(state, spinner);
        this.brakeButton = new BrakeButton();
        this.turboOffButton = new TurboOffButton();
        this.turboOnButton = new TurboOnButton();
        this.raiseBedButton = new RaiseBedButton();
        this.lowerBedButton = new LowerBedButton();
        this.startButton = new StartButton();
        this.stopButton = new StopButton();
        this.gasPanel = new GasPanel(spinner);
        initComponents();
        }


    public void initComponents(){
        this.add(gasPanel);
        this.setLayout(new GridLayout(2,4));
        this.add(gasButton, 0);
        this.add(turboOnButton, 1);
        this.add(raiseBedButton, 2);
        this.add(brakeButton, 3);
        this.add(turboOffButton, 4);
        this.add(lowerBedButton, 5);
        this.setPreferredSize(new Dimension(400, 200));
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
