package controller;

import javax.swing.*;
import java.awt.*;

public class GasPanel extends JPanel{
    JLabel gasLabel = new JLabel("Amount of gas");
    Spinner spinner = new Spinner();


    public void initComponents(){
        this.setLayout(new BorderLayout());
        this.add(gasLabel, BorderLayout.PAGE_START);
        this.add(spinner, BorderLayout.PAGE_END);

//        this.add(gasPanel);
    }
}
