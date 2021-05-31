package Instruments;

public class Drums extends Instruments implements IPlay{

 private int sellingPrice;
 private int purchasePrice;
 private int size;

    public Drums(String material, String color, String type, int sellingPrice, int purchasePrice) {
        super(material, color, type);
        this.sellingPrice = sellingPrice;
        this.purchasePrice = purchasePrice;
        this.size = size;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getSize() {
        return size;
    }

    public String play() {
        return "Drum sound";
    }

    @Override
    public int calculateMarkup() {
        return this.sellingPrice - this.purchasePrice;
    }
}
