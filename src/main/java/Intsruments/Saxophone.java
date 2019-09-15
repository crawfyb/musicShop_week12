package Intsruments;


public class Saxophone extends Instrument {


    private int numOfValves;

    public Saxophone(String name, double buyPrice, double sellPrice, String sound, int numOfValves) {
        super(name, buyPrice, sellPrice, sound);
        this.numOfValves = numOfValves;
    }

    public int getNumOfValves() {
        return numOfValves;
    }


}