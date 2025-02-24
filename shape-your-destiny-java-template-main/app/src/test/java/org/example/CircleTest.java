package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {
    @Test
    void testArea() {
        Circle circle = new Circle(5);
        assertEquals(78.5398, circle.getArea(), 0.0001); // Using delta for precision
    }

    @Test
    void testPerimeter() {
        Circle circle = new Circle(5);
        assertEquals(31.4159, circle.getPerimeter(), 0.0001); // Using delta for precision
    }
}
