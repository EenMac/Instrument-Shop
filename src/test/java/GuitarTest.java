import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void main(){
        guitar = new Guitar("Ivory", "White", "Bass", 10000, 100, 7);
    }

    @Test
    public void getMaterial() {
        assertEquals("Ivory", guitar.getMaterial());
    }

    @Test
    public void getColor() {
        assertEquals("White", guitar.getColor());
    }

    @Test
    public void getType() {
        assertEquals("Bass", guitar.getType());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(10000, guitar.getSellingPrice());
    }

    @Test
    public void getPurchasePrice() {
        assertEquals(100, guitar.getPurchasePrice());
    }
}
