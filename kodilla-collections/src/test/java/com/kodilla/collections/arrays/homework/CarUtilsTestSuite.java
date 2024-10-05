package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Volvo;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarUtilsTestSuite {


    @Test
    public void testGetCarBrand() {
        Car car = new Volvo(50.0);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        CarUtils.describeCar(car);
        System.setOut(originalOut);

        String output = outputStream.toString();
        assertTrue(output.contains("Car brand: Volvo"));
    }
}
