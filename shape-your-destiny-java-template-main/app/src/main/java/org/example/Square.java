package org.example;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
