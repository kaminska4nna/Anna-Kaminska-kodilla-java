package com.kodilla.exception.test;

import java.util.HashMap;

public class Main {

    public static void main(String args[]) {

        HashMap<String, Boolean> airports = new HashMap<>();
        airports.put("Okęcie", false);


        FlightFinder search = new FlightFinder(airports);
        Flight myFlight = new Flight("Luton", "Okęcie");

        try {
            search.findFlight(myFlight);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally...");
        }
    }
}

