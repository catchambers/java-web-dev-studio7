package org.launchcode.studio7;

public interface OpticalDisc {
    static final int centerDiameter = 15; //mm
    static final int discDiameter = 80; //mm
    static final boolean isDataStorage = true;

    double storageAvailable(double storageCapacity, double storageInUse);

    String readDisc();

    void writeDisc(String infoToStore);

}
