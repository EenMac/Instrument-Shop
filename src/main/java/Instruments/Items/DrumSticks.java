package Instruments.Items;

import Instruments.ISell;

public class DrumSticks implements ISell {
    private String description;
    private int purchasePrice;
    private int sellingPrice;

    public DrumSticks(String description, int purchasePrice, int sellingPrice) {
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

    public int calculateMarkup() {
        return this.sellingPrice - this.purchasePrice;
    }
}
