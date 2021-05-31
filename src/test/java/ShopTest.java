import Instruments.Drums;
import Instruments.Guitar;
import Instruments.Instruments;
import Instruments.Items.DrumSticks;
import Instruments.Items.GuitarStrings;
import Instruments.Piano;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    private Piano piano;
    private Guitar guitar;
    private Drums drums;
    private DrumSticks drumSticks;
    private GuitarStrings guitarStrings;
    private Shop shop;

    @Before
    public void setUp(){
        piano = new Piano("marble", "gold/grey/cream", "Grand", 15000, 1500, 20);
        guitar = new Guitar("Ivory", "White", "Bass", 10000, 100, 7);
        drums = new Drums("Wood", "Grey/blue", "GoodDrums", 100, 75);
        drumSticks = new DrumSticks("Will turn you into the next Travis Barker", 10, 20);
        guitarStrings = new GuitarStrings("Made from the devils chestHair - highly combustible", 15, 25);
        shop = new Shop();
    }

    @Test
    public void testShopStartsEmpty() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void testCanAddPiano() {
        shop.add(piano);
        assertEquals(1, shop.getStockCount());
        assertEquals(true, shop.getStock().contains(piano));
    }

    @Test
    public void testShopCanRemoveItem() {
        shop.add(piano);
        shop.add(drums);
        shop.remove(piano);
        assertEquals(1, shop.getStockCount());
        assertEquals(true, shop.getStock().contains(drums));
        assertEquals(false, shop.getStock().contains(piano));
    }

    @Test
    public void getProfit() {
        shop.add(piano);
        shop.add(drums);
        shop.add(guitar);
        shop.sell(piano);
        assertEquals(13500, shop.calculateProfit(piano));
    }
}
