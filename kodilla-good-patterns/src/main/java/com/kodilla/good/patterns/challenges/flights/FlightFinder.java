package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    public void searchFlightsFrom(String city) {

        List<Flight> departureAirports = FlightsDatabase.getDatabase().stream()
                .filter(departure -> departure.getDepartureAirport().equals(city))
                .collect(Collectors.toList());

        if (departureAirports.equals(null)) {
            System.out.println("No such city found!");
        } else {
            departureAirports.forEach(System.out::println);
        }


    }

    public void searchFlightsTo(String city) {

        List<Flight> arrivalAirports = FlightsDatabase.getDatabase().stream()
                .filter(arrival -> arrival.getArrivalAirport().equals(city))
                .collect(Collectors.toList());

        if (arrivalAirports.equals(null)) {
            System.out.println("No such city found!");
        } else {
            arrivalAirports.forEach(System.out::println);
        }


    }

}

