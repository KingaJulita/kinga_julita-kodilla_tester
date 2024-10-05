package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTestSuite {

    @Test
    public void testToyotaIncreaseSpeed() {
        Toyota toyota = new Toyota(100);
        toyota.increaseSpeed();
        assertEquals(115, toyota.getSpeed());
    }

    @Test
    public void testToyotaDecreaseSpeed() {
        Toyota toyota = new Toyota(100);
        toyota.decreaseSpeed();
        assertEquals(90, toyota.getSpeed());
    }

    @Test
    public void testVolvoIncreaseSpeed() {
        Volvo volvo = new Volvo(110);
        volvo.increaseSpeed();
        assertEquals(125, volvo.getSpeed());
    }

    @Test
    public void testVolvoDecreaseSpeed() {
        Volvo volvo = new Volvo(110);
        volvo.decreaseSpeed();
        assertEquals(95, volvo.getSpeed());
    }

    @Test
    public void testSkodaIncreaseSpeed() {
        Skoda skoda = new Skoda(90);
        skoda.increaseSpeed();
        assertEquals(100, skoda.getSpeed());
    }

    @Test
    public void testSkodaDecreaseSpeed() {
        Skoda skoda = new Skoda(90);
        skoda.decreaseSpeed();
        assertEquals(75, skoda.getSpeed());
    }
}
