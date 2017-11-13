package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public FlightSearch(HashMap<String, Boolean> airports) {
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();

        airports.put("Wrocław", true);
        airports.put("Okęcie", true);
        airports.put("Luton", false);


        Boolean flightIsPossible = airports.get(flight.getArrivalAirport());

        if (flightIsPossible != true) {
                throw new RouteNotFoundException();
            } else return flightIsPossible;

        }
    }
