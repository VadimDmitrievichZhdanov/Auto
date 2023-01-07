package Interfaces;

public class Square implements Shape {

    private double length;

    public Square() {
        length = 0;
    }

    public Square(double _length) {
        length = _length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}