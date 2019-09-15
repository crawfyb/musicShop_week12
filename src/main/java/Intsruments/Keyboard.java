package Intsruments;


public class Keyboard extends Instrument {


    private int numOfKeys;

    public Keyboard(String name, double buyPrice, double sellPrice, String sound, int numOfKeys) {
        super(name, buyPrice, sellPrice, sound);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }


}