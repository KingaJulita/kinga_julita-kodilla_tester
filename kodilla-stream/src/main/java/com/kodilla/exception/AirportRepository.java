package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private Map<String, Boolean> getListOfAirports() {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Miami " , true);
        airports.put("Malta ", true);
        airports.put("LasPalmas ", false);
        airports.put("Warsaw ", true);
        return airports;
    }

    public boolean isAirportsInUse(String airports) throws AirportNotFoundException {
        if (getListOfAirports().containsKey(airports))
            return getListOfAirports().get(airports);
        throw new AirportNotFoundException();
    }
}
