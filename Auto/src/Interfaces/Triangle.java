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

    @Override
    public double getArea() {
        double semi_length = ((lengthA + lengthB + lengthC) / 2);
        return Math.sqrt(semi_length * (semi_length - lengthA) *
                (semi_length - lengthB) * (semi_length - lengthC));
    }

    public void setLengthA(double lengthA) {
        this.lengthA = lengthA;
    }

    public double getLengthA() {
        return lengthA;
    }

    public void setLengthB(double lengthB) {
        this.lengthB = lengthB;
    }

    public double getLengthB() {
        return lengthB;
    }

    public void setLengthC(double lengthC) {
        this.lengthC = lengthC;
    }

    public double getLengthC() {
        return lengthC;
    }

    public static void main(String[] args) {
        Triangle t567 = new Triangle(5,6,7);
        Triangle t8910 = new Triangle(8,9,10);
        double area567 = t567.getArea();
        double area8910 = t8910.getArea();
        System.out.println(area567);
        System.out.println(area8910);
    }
}


