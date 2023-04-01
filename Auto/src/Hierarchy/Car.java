package Hierarchy;

public class Car implements Drive {
    @Override
    public void driveOn() {
        changeGear();
        changeGear();
        changeGear();
    }

    @Override
    public void driveOf() throws Exception {
        changeGear();
    }

    protected void changeGear() {
    }
}
