package org.launchcode.studio7;

public class FloppyDisc extends BasicDisc {
    private final static int DEFAULT_MIN_SPEED = 300;
    private final static int DEFAULT_MAX_SPEED = 350;

    public FloppyDisc() {
        super(DEFAULT_MIN_SPEED, DEFAULT_MAX_SPEED);
    }
}
