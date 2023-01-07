package Interfaces;

public class Circle implements Shape {

    static final double pi = 3.14;
    private double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(double _radius) {
        radius = _radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        //return PI * radius * radius;
        return pi * Math.pow(radius, 2);
    }
}


