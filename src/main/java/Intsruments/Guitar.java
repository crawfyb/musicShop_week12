package Intsruments;


import Behaviours.ISell;

public class Guitar extends Instrument implements ISell {


    private int numOfStrings;

    public Guitar(String name, double buyPrice, double sellPrice, String sound, int numOfStrings) {
        super(name, buyPrice, sellPrice, sound);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }






}
