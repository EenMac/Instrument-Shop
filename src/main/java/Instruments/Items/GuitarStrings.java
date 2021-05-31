package Instruments.Items;

public class GuitarStrings {
    private String description;
    private int purchasePrice;
    private int sellingPrice;

    public GuitarStrings(String description, int purchasePrice, int sellingPrice) {
        this.description = description;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }
}
