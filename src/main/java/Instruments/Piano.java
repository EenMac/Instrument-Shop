package Instruments;

public class Piano extends Instruments implements IPlay{

    private int sellingPrice;
    private int purchasePrice;
    private int age;

    public Piano(String material, String color, String type, int sellingPrice, int purchasePrice, int age) {
        super(material, color, type);
        this.sellingPrice = sellingPrice;
        this.purchasePrice = purchasePrice;
        this.age = age;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getAge() {
        return age;
    }

    public String play() {
        return "Piano sound";
    }


    public int calculateMarkup() {
        return this.sellingPrice - this.purchasePrice;
    }
}
