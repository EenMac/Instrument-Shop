import Instruments.Items.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {
    private DrumSticks drumSticks;

    @Before
    public void setUp(){
        drumSticks = new DrumSticks("Will turn you into the next Travis Barker", 10, 20);
    }

    @Test
    public void getDescription() {
        assertEquals("Will turn you into the next Travis Barker", drumSticks.getDescription());
    }

    @Test
    public void getPurchasingPrice() {
        assertEquals(10, drumSticks.getPurchasePrice());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(20, drumSticks.getSellingPrice());
    }
}
