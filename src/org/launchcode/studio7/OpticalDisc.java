package org.launchcode.studio7;

public interface OpticalDisc {
    String shape = "Circle";

    default void startSpin() {
        System.out.println("Spin has started!");
    };

    default void stopSpin() {
        System.out.println("Spin has stopped.");
    };

}
