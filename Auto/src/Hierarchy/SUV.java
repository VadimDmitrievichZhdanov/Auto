package Hierarchy;

public class SUV extends Jeep {
    @Override
    public void driveOn() {
        super.driveOn();
    }

    @Override
    protected void changeGear() {
        super.changeGear();
    }

    @Override
    public void driveTerrainType() {
        System.out.println("Asphalt");

    }
}