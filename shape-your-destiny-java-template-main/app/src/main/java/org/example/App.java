package org.example;

public class App {
    public static void main(String[] args) {
        // Create different shapes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Square square = new Square(4);
        RightTriangle rightTriangle = new RightTriangle(3, 4);
        IsoscelesRightTriangle isoTriangle = new IsoscelesRightTriangle(5);

        // Print details
        System.out.println("Circle: Area = " + circle.getArea() + ", Perimeter = " + circle.getPerimeter());
        System.out.println("Rectangle: Area = " + rectangle.getArea() + ", Perimeter = " + rectangle.getPerimeter());
        System.out.println("Square: Area = " + square.getArea() + ", Perimeter = " + square.getPerimeter());
        System.out.println("Right Triangle: Area = " + rightTriangle.getArea() + ", Perimeter = " + rightTriangle.getPerimeter());
        System.out.println("Isosceles Right Triangle: Area = " + isoTriangle.getArea() + ", Perimeter = " + isoTriangle.getPerimeter());
    }
}
