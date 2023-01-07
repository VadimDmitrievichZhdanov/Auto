package OOPpart1.project.parts;

import java.util.Random;

public class Processor {
    Random random = new Random();
    static String cpuName = "Intel(R) Core(TM) i7-8700 CPU";
    static String coprocessor = null;
    int cachMemory = 12;
    int[] cpuCore = new int[10];
    public double CpuCore(double frequency) {
        frequency = random.nextDouble();
        return frequency;
    }




    public static void main(String[] args) {
    }

}
