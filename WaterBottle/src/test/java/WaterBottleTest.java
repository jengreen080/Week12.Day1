import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterbottle;

    @Before
    public void before() { waterbottle = new WaterBottle(100);

    }

    @Test
    public void checkIfFull(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void checkTakesFromVolume(){
        waterbottle.reduceVolume();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void checkReturnsToZero(){
        waterbottle.clearBottle();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void checkFillsBackToFull(){
        waterbottle.fillToFull();
        assertEquals(100, waterbottle.getVolume());
    }
}
