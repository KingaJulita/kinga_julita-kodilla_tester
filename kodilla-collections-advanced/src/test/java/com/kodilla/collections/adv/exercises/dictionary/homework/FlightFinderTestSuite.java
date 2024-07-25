package com.kodilla.collections.adv.exercises.dictionary.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightFrom() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        String departure = "Oslo";
        // when
        List<Flight> result = flightFinder.findFlightsFrom(departure);
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Gdańsk", "Oslo"));
        expectedList.add(new Flight("Szczecin", "Oslo"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightFromNoExistingCity() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        String departure = "No existing city";
        // when
        List<Flight> result = flightFinder.findFlightsFrom(departure);
        // then
        List<Flight> expectedList = new ArrayList<>();
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightTo() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        String arrival = "Warszawa";
        // when
        List<Flight> result = flightFinder.findFlightsTo(arrival);
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warszawa", "Berlin"));
        expectedList.add(new Flight("Warszawa", "Paryż"));
        expectedList.add(new Flight("Warszawa","Tokyo"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightToNoExistingCity() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        String arrival = "No existing city";
        // when
        List<Flight> result = flightFinder.findFlightsTo(arrival);
        // then
        List<Flight> expectedList = new ArrayList<>();
        assertEquals(expectedList, result);
    }

}