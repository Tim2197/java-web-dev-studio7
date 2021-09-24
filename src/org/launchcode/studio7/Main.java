package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD newCd = new CD();
        DVD newDvd = new DVD();
        String s = newCd.getSize();

        // TODO: Call each CD and DVD method to verify that they work as expected.

        System.out.println(s);
        newDvd.startSpin();
        newCd.stopSpin();
        System.out.println(newCd.getSize());
        newCd.setSize("100MM");
        System.out.println(newCd.getSize());

    }
}
