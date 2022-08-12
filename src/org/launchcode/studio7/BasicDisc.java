package org.launchcode.studio7;

public abstract class BasicDisc implements SpinnableDisc {
    public static final int STOPPED = 0, SPEEDING = 1, SPINNING = 2, SLOWING = 3;
    int minSpeed, maxSpeed;
    int phase;

    public BasicDisc(int minSpeed, int maxSpeed) {
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        phase = STOPPED;
    }

    @Override
    public void spinDisc() {
        do {
            switch (phase) {
                case STOPPED -> startSpinning();
                case SPEEDING -> phase = SPINNING;
                case SPINNING -> {
                    System.out.printf("  A %s spins at a rate of %d - %d rpm.\n", getClass().getSimpleName(), minSpeed, maxSpeed);
                    phase = SLOWING;
                }
                case SLOWING -> stopSpinning();
                default -> System.out.println("ERROR: Shouldn't be here. Disc broken.");
            }
        } while (isSpinning());
    }

    @Override
    public void startSpinning() {
        System.out.printf("Started spinning %s...\n", getClass().getSimpleName());
        phase = SPEEDING;
    }

    @Override
    public void stopSpinning() {
        System.out.printf("...%s finished spinning.\n", getClass().getSimpleName());
        phase = STOPPED;
    }

    @Override
    public boolean isSpinning() {
        return phase != STOPPED;
    }

    public boolean isFinished() {
        return phase == STOPPED;
    }
}
