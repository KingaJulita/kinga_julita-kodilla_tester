package com.kodilla.collections.adv.exercises.dictionary.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Kraków", "Bali"));
        flights.add(new Flight("Gdańsk", "Madryt"));
        flights.add(new Flight("Gdańsk", "Oslo"));
        flights.add(new Flight("Warszawa", "Berlin"));
        flights.add(new Flight("Warszawa", "Paryż"));
        flights.add(new Flight("Szczecin", "Oslo"));
        flights.add(new Flight("Szczecin", "Warszawa"));
        flights.add(new Flight("Warszawa", "Tokyo"));

        return flights;

    }
}
