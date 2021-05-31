package Instruments;

public class Guitar extends Instruments implements IPlay{

    private int sellingPrice;
    private int purchasePrice;
    private int stringNo;


    public Guitar(String material, String color, String type, int sellingPrice, int purchasePrice, int stringNo) {
        super(material, color, type);
        this.sellingPrice = sellingPrice;
        this.purchasePrice = purchasePrice;
        this.stringNo = stringNo;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getStringNo() {
        return stringNo;
    }

    @Override
    public String play() {
        return "Guitar sound";
    }

    @Override
    public int calculateMarkup() {
        return this.sellingPrice - this.purchasePrice;
    }
}
