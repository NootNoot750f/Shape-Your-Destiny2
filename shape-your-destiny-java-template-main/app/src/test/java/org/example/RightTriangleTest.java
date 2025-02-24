package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class RightTriangleTest {
    @Test
    void testArea() {
        RightTriangle triangle = new RightTriangle(3, 4);
        assertEquals(6, triangle.getArea());
    }

    @Test
    void testPerimeter() {
        RightTriangle triangle = new RightTriangle(3, 4);
        assertEquals(12, triangle.getPerimeter(), 0.0001);
    }
}
