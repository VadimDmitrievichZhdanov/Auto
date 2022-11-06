package Interfaces;

public class Square implements Shape {

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

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    private double length;
}