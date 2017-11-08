package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public FlightSearch(HashMap<String, Boolean> airports) {
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();

        airports.put("Wrocław", true);
        airports.put("Okęcie", true);
        airports.put("Luton", false);

        for (Map.Entry<String, Boolean> entry : airports.entrySet()) {

            if (!airports.containsKey(flight.getArrivalAirport())) {
                throw new RouteNotFoundException();
            }

            if (!airports.containsKey(flight.getDepartureAirport())) {
                throw new RouteNotFoundException();
            }

            if (entry.getKey() == flight.getArrivalAirport() && entry.getValue()) {
                System.out.println("Flight to " + flight.getArrivalAirport() + " has been found");
            } else {
                System.out.println("Flight to " + flight.getArrivalAirport() + " has not been found");
            }
        }
    }
}