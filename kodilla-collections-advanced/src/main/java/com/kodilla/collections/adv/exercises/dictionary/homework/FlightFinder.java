package com.kodilla.collections.adv.exercises.dictionary.homework;

import java.util.ArrayList;
import java.util.List;


public class FlightFinder {
    private List<Flight> flights;

    public FlightFinder() {
        this.flights = FlightRepository.getFlightsTable();
    }


    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDeparture().equalsIgnoreCase(departure)) {
                result.add(flight);
            }
        }
        return result;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getArrival().equalsIgnoreCase(arrival)) {
                result.add(flight);
            }
        }
        return result;
    }
}
