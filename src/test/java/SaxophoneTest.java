import Intsruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp() {
        saxophone = new Saxophone("Sexy Sax", 20.00,45.00, "Sexy sax sound", 88);
    }

    @Test
    public void getname() {
        assertEquals("Sexy Sax", saxophone.getName());
    }

    @Test
    public void buyPrice() {
        assertEquals(20.00, saxophone.getBuyPrice(), 0.01);
    }

    @Test
    public void sellPrice() {
        assertEquals(45.00, saxophone.getSellPrice(), 0.01);
    }

    @Test
    public void getSound() {
        assertEquals("Sexy sax sound", saxophone.getSound());
    }

    @Test
    public void saxophoneHasValves() {
        assertEquals(88, saxophone.getNumOfValves());
    }

    @Test
    public void canSell() {
        saxophone.sell(0);
        assertEquals(25.00, saxophone.getPrice(), 0.01);
    }
}
