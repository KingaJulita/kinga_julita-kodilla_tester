package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShapeUtilsTestSuite {

    @Test
    public void testDisplayShapeInfo() {
        // Given
        Shape circle = new Circle(5);
        Shape square = new Square(5);
        Shape triangle = new Triangle(3, 4, 5);

        // Stream to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // When
        ShapeUtils.displayShapeInfo(circle);
        ShapeUtils.displayShapeInfo(square);
        ShapeUtils.displayShapeInfo(triangle);

        // Restore the original system output
        System.setOut(originalOut);

        // Then
        String output = outputStream.toString();
        assertTrue(output.contains("Shape kind: Circle"));
        assertTrue(output.contains("Shape kind: Square"));
        assertTrue(output.contains("Shape kind: Triangle"));
    }
}
