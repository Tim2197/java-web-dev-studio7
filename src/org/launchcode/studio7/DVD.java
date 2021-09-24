package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    String shape = "Circle";
    String storageCapacity = "4.7GB";
    String name = "Digital Versatile Disc";
    String size = "0.6MM";

    @Override
    public void startSpin () {
        System.out.println("Spin has started at about 1000rpm");
    }

    @Override
    public void stopSpin () {
        System.out.println("Spin has stopped.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
