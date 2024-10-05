package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volvo;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarApplicationTestSuite {

    @Test
    public void testMainMethod() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        CarApplication.main(new String[]{});

        System.setOut(originalOut);

        String output = outputStream.toString();

        assertTrue(output.contains("Car brand:"));
        assertTrue(output.contains("Car increase speed:"));
    }

    @Test
    public void testDrawCar() {
        Car car = CarApplication.drawCar();
        assertTrue(car instanceof Skoda || car instanceof Volvo || car instanceof Toyota);
    }
}
