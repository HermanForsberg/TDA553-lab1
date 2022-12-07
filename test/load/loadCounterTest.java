package load;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

import org.junit.jupiter.api.Test;

import vehicle.*;

public class loadCounterTest {
    @Test
    public void maxNumberOfCars_should_not_be_below_1(){
        LoadCounter loadCounter = new LoadCounter(-2);
        assertEquals(1, loadCounter.getMaxNumberOfCars());
    }

    @Test 
    public void currentNumberOfCars_should_be_incremented_by_1(){
        LoadCounter loadCounter = new LoadCounter(-2);
        Car car = new Saab95(4, 200.0, 100.0, Color.RED);
        loadCounter.load(car);
        assertEquals(1, loadCounter.getCurrentNumberOfCars());
    }
}
