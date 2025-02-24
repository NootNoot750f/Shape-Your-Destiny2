package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class RectangleTest {
    @Test
    void testArea() {
        Rectangle rectangle = new Rectangle(4, 6);
        assertEquals(24, rectangle.getArea());
    }

    @Test
    void testPerimeter() {
        Rectangle rectangle = new Rectangle(4, 6);
        assertEquals(20, rectangle.getPerimeter());
    }
}
