package Intsruments;


public abstract class Instrument {

    private String name;
    private double buyPrice;
    private double sellPrice;
    private String sound;

    public Instrument(String name, double buyPrice, double sellPrice, String sound) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.sound = sound;

    }

    public String getName() {
        return name;
    }


    public double getBuyPrice() {
        return buyPrice;
    }



    public double getSellPrice() {
        return sellPrice;
    }

    public String getSound() {
        return sound;
    }

    public void sell(int number) {
        sellPrice -= buyPrice * number;
    }

    public double getPrice() {
        return sellPrice -= buyPrice;
    }


}

