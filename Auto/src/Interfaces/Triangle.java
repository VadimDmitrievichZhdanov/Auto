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
        Triangle triangle1 = new Triangle(5, 6, 7);
        Triangle triangle2 = new Triangle(8, 9, 10);
        System.out.println(triangle1.getArea());
        System.out.println(triangle2.getArea());
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


