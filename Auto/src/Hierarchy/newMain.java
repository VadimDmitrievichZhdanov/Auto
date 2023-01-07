package Hierarchy;

// Todo: think about how to add Track, Jeep

import java.util.ArrayList;
import java.util.LinkedList;

public class newMain {
    static public ArrayList<Drive> getEngines() {
        ArrayList<Drive> engines = new ArrayList<>();

        engines.add(new Car());
        engines.add(new Minivan());
        engines.add(new Minivan());
        engines.add(new Minivan());

        engines.add(new SUV());
        engines.add(new FrameJeep());
        engines.add(new SUV());
        engines.add(new FrameJeep());
        engines.add(new Track());
        engines.add(new Track());
        engines.add(new Pajero());

        engines.add(new Bike());
        engines.add(new Bike());
        engines.add(new Bike());
        engines.add(new Bike());
        engines.add(new Bike());
        engines.add(new Bike());
        engines.add(new Bike());
        engines.add(new Bike());

        return engines;
    }

    public static void main(String[] args) {

        try {
            for (Drive engine : getEngines()) {
                engine.driveOn();
            }

            for (Drive engine : getEngines()) {
                engine.driveOf();
            }
        }
        //catch(ExecutionControl.NotImplementedException ex){
        //    System.out.println(ex.toString());
        //}
        catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public LinkedList<Drive> getTransmission() {
        LinkedList<Drive> transmission = new LinkedList<>();
        transmission.add(new SUV());
        transmission.add(new Pajero());
        return transmission;
    }
}