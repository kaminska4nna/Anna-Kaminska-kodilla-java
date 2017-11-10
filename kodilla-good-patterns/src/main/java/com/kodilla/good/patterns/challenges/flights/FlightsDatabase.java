package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;

public class FlightsDatabase {
    private static HashSet<Flight> flightDestinations = new HashSet<>();

    public static HashSet<Flight> getDatabase() {
        Flight warsawGdansk = new Flight("Warsaw", "Gdansk");
        Flight lutonWarsaw = new Flight("Luton", "Warsaw");
        Flight warsawLuton = new Flight("Warsaw", "Luton");
        Flight lutonGdansk = new Flight("Luton", "Gdansk");
        Flight gdanskBerlin = new Flight("Gdansk", "Berlin");

        flightDestinations.add(warsawGdansk);
        flightDestinations.add(lutonWarsaw);
        flightDestinations.add(warsawLuton);


        return flightDestinations;
    }

}
