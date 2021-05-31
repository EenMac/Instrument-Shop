import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("marble", "gold/grey/cream", "Grand", 15000, 1500, 20);
    }

    @Test
    public void getMaterial() {
        assertEquals("marble", piano.getMaterial());
    }

    @Test
    public void getColor() {
        assertEquals("gold/grey/cream", piano.getColor());
    }

    @Test
    public void getType() {
        assertEquals("Grand", piano.getType());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(15000, piano.getSellingPrice());
    }
    @Test
    public void getPurchasingPrice(){
        assertEquals(1500, piano.getPurchasePrice());
    }

    @Test
    public void getAge() {
        assertEquals(20, piano.getAge());
    }
}
