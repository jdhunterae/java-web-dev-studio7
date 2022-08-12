package org.launchcode.studio7;

public class CD extends BasicDisc {
    private final static int DEFAULT_MIN_SPEED = 200;
    private final static int DEFAULT_MAX_SPEED = 500;

    public CD() {
        super(DEFAULT_MIN_SPEED, DEFAULT_MAX_SPEED);
    }
}
