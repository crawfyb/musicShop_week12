import Intsruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Les Paul", 15.00,25.00, "Wawawawawa", 6);
    }

    @Test
    public void getname() {
        assertEquals("Les Paul", guitar.getName());
    }

    @Test
    public void buyPrice() {
        assertEquals(15.00, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void sellPrice() {
        assertEquals(25.00, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void getSound() {
        assertEquals("Wawawawawa", guitar.getSound());
    }

    @Test
    public void guitarHasStrings() {
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void canSell() {
        guitar.sell(0);
        assertEquals(10.00, guitar.getPrice(), 0.01);
    }
}
