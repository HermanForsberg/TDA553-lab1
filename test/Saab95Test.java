import static org.junit.Assert.*;
import java.awt.*;

import org.junit.jupiter.api.Test;

public class Saab95Test {
    @Test
    public void setTurboOn_TurboOn_Should_Be_True() {
        Saab95 saab95 = new Saab95(4, 200.0, 100.0, Color.RED);
        saab95.setTurboOn();
        assertTrue(saab95.getTurboOn());
    }

    @Test
    public void setTurboOff_TurboOn_Should_Be_False(){
        Saab95 saab95 = new Saab95(4, 200.0, 100.0, Color.RED);
        saab95.setTurboOff();
        assertFalse(saab95.getTurboOn());
        }

    @Test
    public void speedFactor_Should_Be_20(){
        Saab95 saab95 = new Saab95(4, 200.0, 100.0, Color.RED);
        assertEquals(saab95.speedFactor(), 20, 0.05);
    }
}
