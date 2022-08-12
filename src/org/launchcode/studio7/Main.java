package org.launchcode.studio7;

public class Main {

    public static void main(String[] args) {
        CD myCd = new CD();
        DVD myDvd = new DVD();
        LP myLp = new LP();
        FloppyDisc myFloppy = new FloppyDisc();

        myCd.spinDisc();
        myDvd.spinDisc();
        myLp.spinDisc();
        myFloppy.spinDisc();
    }
}
