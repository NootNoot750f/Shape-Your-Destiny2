package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SquareTest {
    @Test
    void testArea() {
        Square square = new Square(4);
        assertEquals(16, square.getArea());
    }

    @Test
    void testPerimeter() {
        Square square = new Square(4);
        assertEquals(16, square.getPerimeter());
    }
}
