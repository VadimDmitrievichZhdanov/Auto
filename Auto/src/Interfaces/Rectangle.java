package Interfaces;

public class Rectangle implements Shape {

    private double length;
    private double high;

    public Rectangle() {
        length = 0;
    }

    public Rectangle(double _length, double _high) {
        length = _length;
        high = _high;
    }

    @Override
    public double getArea() {
        return length * high;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}