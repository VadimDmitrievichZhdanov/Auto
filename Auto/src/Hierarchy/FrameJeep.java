package Hierarchy;

public class FrameJeep extends Jeep {
    @Override
    public void driveOn() {
        super.driveOn();
        // + 2 special lines due to AWD
    }

    @Override
    protected void changeGear() {
        super.changeGear();
        // ADD 2 lines of code
    }

    @Override
    public void driveTerrainType() {
        System.out.println("Asphalt");
        System.out.println("Off-roads");
    }
}
