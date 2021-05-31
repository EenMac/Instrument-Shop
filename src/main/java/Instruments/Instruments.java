package Instruments;

public abstract class Instruments implements ISell{

    String Material;
    String Color;
    String Type;

    public void setMaterial(String material) {
        Material = material;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setType(String type) {
        Type = type;
    }

    public Instruments(String material, String color, String type) {
        Material = material;
        Color = color;
        Type = type;
    }

    public String getMaterial() {
        return Material;
    }

    public String getColor() {
        return Color;
    }

    public String getType() {
        return Type;
    }
}
