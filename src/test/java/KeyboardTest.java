import Intsruments.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void setUp() {
        keyboard = new Keyboard("Cassio2000", 10.00,20.00, "doop dela doop", 100);
    }

    @Test
    public void getname() {
        assertEquals("Cassio2000", keyboard.getName());
    }

    @Test
    public void buyPrice() {
        assertEquals(10.00, keyboard.getBuyPrice(), 0.01);
    }

    @Test
    public void sellPrice() {
        assertEquals(20.00, keyboard.getSellPrice(), 0.01);
    }

    @Test
    public void getSound() {
        assertEquals("doop dela doop", keyboard.getSound());
    }

    @Test
    public void keyboardHasKeys() {
        assertEquals(100, keyboard.getNumOfKeys());
    }

    @Test
    public void canSell() {
        keyboard.sell(0);
        assertEquals(10.00, keyboard.getPrice(), 0.01);
    }
}
