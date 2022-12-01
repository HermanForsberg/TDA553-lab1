import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

import org.junit.jupiter.api.Test;

public class CarRepairShopTest{
    @Test
    public void maxNumberOfCars_should_not_be_below_1(){
        CarRepairShop carRepairShop = new CarRepairShop(-50, 0, 1, 1);
        assertEquals(1, carRepairShop.getMaxNumberOfCars());
    }

    @Test 
    public void currentNumberOfCars_should_be_incremented_by_1(){
        CarRepairShop carRepairShop = new CarRepairShop(5, 0, 1, 1);
        Car car = new Saab95(4, 200.0, 100.0, Color.RED);
        carRepairShop.load(car);
        assertEquals(1, carRepairShop.getCurrentNumberOfCars());
    }
    @Test
    public void load_is_able_to_load(){
        CarRepairShop MECA = new CarRepairShop(5, 0, 1, 1);
        Car saab95 = new Saab95(4, 50, 50, Color.RED);
        MECA.load(saab95);
        assertTrue(saab95.loaded);
    }
    @Test
    public void unload_is_able_to_unload(){
        CarRepairShop mekonomen = new CarRepairShop(5, 0, 1, 1);
        Car finBil = new Volvo240(4, 150, 20, Color.GREEN);
        mekonomen.load(finBil);
        mekonomen.unload(finBil);
        assertFalse(finBil.loaded);
    }
    @Test
    public void load_should_not_load(){
        CarRepairShop jönssonsBilverkstad = new CarRepairShop(2, 0, 4, 4);
        Car janssonsBil = new Volvo240(4, 10, 10, Color.YELLOW);
        jönssonsBilverkstad.load(janssonsBil);
        assertFalse(janssonsBil.loaded);
    }
}