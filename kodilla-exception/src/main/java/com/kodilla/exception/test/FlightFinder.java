package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    private HashMap<String, Boolean> airports;

    public FlightFinder(HashMap<String, Boolean> airports) {
        this.airports = this.airports;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (flight != null && airports != null) {

            if (airports.containsKey(flight.getArrivalAirport())) {
                for (Map.Entry<String, Boolean> entry : airports.entrySet()) {
                    if (entry.getKey().equals(flight.getArrivalAirport())) {
                        System.out.println("Airport: " + flight.getArrivalAirport() + " ; " + "possibility to flight: " + entry.getValue());
                    }
                }
            } else {
                throw new RouteNotFoundException("Airport not found!");
            }

        }


    }

}