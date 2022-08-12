package org.launchcode.studio7;

public class DVD extends BasicDisc {
    private final static int DEFAULT_MIN_SPEED = 570;
    private final static int DEFAULT_MAX_SPEED = 1600;

    public DVD() {
        super(DEFAULT_MIN_SPEED, DEFAULT_MAX_SPEED);
    }
}