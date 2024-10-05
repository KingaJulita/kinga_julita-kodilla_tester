package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShapeApplicationTestSuite {

    @Test
    public void testDrawShape() {
        // Given - we're testing the drawShape method directly
        Shape shape1 = ShapeApplication.drawShape();
        Shape shape2 = ShapeApplication.drawShape();
        Shape shape3 = ShapeApplication.drawShape();

        // Then - check if we get the expected shape objects
        assertTrue(shape1 instanceof Shape);
        assertTrue(shape2 instanceof Shape);
        assertTrue(shape3 instanceof Shape);
    }
}
