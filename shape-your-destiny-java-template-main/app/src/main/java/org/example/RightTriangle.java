package org.example;

public class RightTriangle extends Shape implements Polygon {
    private double leg1;
    private double leg2;


    public RightTriangle(double leg1, double leg2) {
        if (leg1 < 0 || leg2 < 0) {
            throw new IllegalArgumentException("Leg lengths cannot be negative");
        }
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return 0.5 * leg1 * leg2;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.hypot(leg1, leg2); // Use Math.hypot() to avoid overflow
        return leg1 + leg2 + hypotenuse;
    }

    @Override
    public int numberOfSides() {
        return 3;
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "leg1=" + leg1 +
                ", leg2=" + leg2 +
                '}';
    }
}