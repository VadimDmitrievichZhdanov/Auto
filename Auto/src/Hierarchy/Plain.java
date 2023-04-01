package Hierarchy;

public class Plain implements Drive {
    @Override
    public void driveOn() {
    }

    @Override
    public void driveOf() throws Exception{
        throw new Exception();
    }
}
