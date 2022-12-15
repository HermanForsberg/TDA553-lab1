package controller;

import javax.swing.*;
import javax.swing.event.*;


public class Spinner extends JSpinner implements javax.swing.SpinnerModel{
    int gasAmount = 0;
    JSpinner gasSpinner;

    public Spinner(){
        super(new SpinnerNumberModel(0, 0,100,1));

    }

    public int getGasAmount() {
        return (int)(getValue());
    }

    

}
