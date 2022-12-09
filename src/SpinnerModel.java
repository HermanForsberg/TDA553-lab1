import vehicle.Vehicle;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.*;
import java.awt.*;



public class SpinnerModel extends JSpinner implements javax.swing.SpinnerModel {
    
    public SpinnerModel(){
        super(new SpinnerNumberModel(0, //initial value
        0, //min
        100, //max
        1)//step)
    );
        }


//     gasSpinner.addChangeListener(new ChangeListener() {
//     public void stateChanged(ChangeEvent e) {
//         gasAmount = (int) ((JSpinner)e.getSource()).getValue();
//     }
// }

}