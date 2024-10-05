package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTestSuite {

    @Test
    public void testGetArea() {
        // Given
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        // When
        double area = triangle.getArea();

        // Then
        assertEquals(6.0, area, 0.01);
    }

    @Test
    public void testGetPerimeter() {
        // Given
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        // When
        double perimeter = triangle.getPerimeter();

        // Then
        assertEquals(12.0, perimeter, 0.01);
    }

    @Test
    public void testEqualsAndHashCode() {
        // Given
        Triangle triangle1 = new Triangle(3.0, 4.0, 5.0);
        Triangle triangle2 = new Triangle(3.0, 4.0, 5.0);

        // Then
        assertEquals(triangle1, triangle2);
        assertEquals(triangle1.hashCode(), triangle2.hashCode());
    }
}
