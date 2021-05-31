import Instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {
    private Drums drums;

    @Before
    public void setUp(){
        drums = new Drums("Wood", "Grey/blue", "GoodDrums", 100, 75);
    }

    @Test
    public void getMaterial() {
        assertEquals("Wood", drums.getMaterial());
    }

    @Test
    public void getColor() {
        assertEquals("Grey/blue", drums.getColor());
    }

    @Test
    public void getType() {
        assertEquals("GoodDrums", drums.getType());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(100, drums.getSellingPrice());
    }

    @Test
    public void getPurchasePrice() {
        assertEquals(75, drums.getPurchasePrice());
    }

    @Test
    public void canPlay() {
        assertEquals("Drum sound", drums.play());
    }
}
