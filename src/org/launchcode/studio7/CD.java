package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {
    String shape = "Circle";
    String storageCapacity = "700MB";
    String name = "Compact Disc";
    String size = "1.2MM";

    @Override
    public void startSpin () {
        System.out.println("Spin has started at about 500rpm.");
    }

    @Override
    public void stopSpin () {
        System.out.println("Spin has stopped.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
