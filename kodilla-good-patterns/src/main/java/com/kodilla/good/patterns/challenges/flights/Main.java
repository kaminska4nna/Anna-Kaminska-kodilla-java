package com.kodilla.good.patterns.challenges.flights;

public class Main {
    public static void main(String[] args) {

        FlightSearcher flightSearcher = new FlightSearcher();

        flightSearcher.searchByStartPoint("Warszawa");
        flightSearcher.searchByEndPoint("Warszawa");
        flightSearcher.searchByConnectionPoint("Gdańsk");

    }
}
