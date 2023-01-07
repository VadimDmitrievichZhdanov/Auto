package Interfaces;

public class Triangle implements Shape {
    private double lengthA;
    private double lengthB;
    private double lengthC;


    public Triangle(double lengthA, double lengthB, double lengthC) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;

    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(5, 6, 7);
        Triangle t2 = new Triangle(8, 9, 10);
        System.out.println(t1.getArea());
        System.out.println(t2.getArea());
    }

    @Override
    public double getArea() {
        double semi_length = ((lengthA + lengthB + lengthC) / 2);
        return Math.sqrt(semi_length * (semi_length - lengthA) *
                (semi_length - lengthB) * (semi_length - lengthC));
    }

    public double getLengthA() {
        return lengthA;
    }

    public void setLengthA(double lengthA) {
        this.lengthA = lengthA;
    }

    public double getLengthB() {
        return lengthB;
    }

    public void setLengthB(double lengthB) {
        this.lengthB = lengthB;
    }

    public double getLengthC() {
        return lengthC;
    }

    public void setLengthC(double lengthC) {
        this.lengthC = lengthC;
    }
}


