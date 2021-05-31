package Shop;

import Instruments.Drums;
import Instruments.Guitar;
import Instruments.ISell;
import Instruments.Items.DrumSticks;
import Instruments.Items.GuitarStrings;
import Instruments.Piano;

import java.util.ArrayList;

public class Shop {
    private Piano piano;
    private Guitar guitar;
    private Drums drums;
    private DrumSticks drumSticks;
    private GuitarStrings guitarStrings;
    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public int getStockCount(){
        return this.stock.size();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public Object add(ISell object) {
        return stock.add(object);
    }

    public Object remove(ISell object) {
        return stock.remove(object);
    }


    public Object sell(ISell object) {
        stock.remove(object);
        return this.calculateProfit(object);
    }

    public Object calculateProfit(ISell object) {
        return object.calculateMarkup();
    }
}
