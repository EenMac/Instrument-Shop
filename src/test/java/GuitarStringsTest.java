import Instruments.Items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {
    private GuitarStrings guitarStrings;

    @Before
    public void setUp(){
        guitarStrings = new GuitarStrings("Made from the devils chestHair - highly combustible", 15, 25);
    }

    @Test
    public void getDescription() {
        assertEquals("Made from the devils chestHair - highly combustible", guitarStrings.getDescription());
    }

    @Test
    public void getPurchasePrice() {
        assertEquals(15, guitarStrings.getPurchasePrice());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(25, guitarStrings.getSellingPrice());
    }
}
