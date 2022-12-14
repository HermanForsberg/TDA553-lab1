package controller;

import javax.swing.*;
import javax.swing.event.*;

public class Spinner extends JSpinner implements javax.swing.SpinnerModel{
    int gasAmount = 0;
    JSpinner gasSpinner;


    public Spinner(){
        SpinnerModel spinnerModel =
                new SpinnerNumberModel(0, //initial value
                        0, //min
                        100, //max
                        1);//step
        gasSpinner = new JSpinner(spinnerModel);
        gasSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                gasAmount = (int) ((JSpinner)e.getSource()).getValue();
            }
        });
    }

    public int getGasAmount() {
        return gasAmount;
    }

    

}
