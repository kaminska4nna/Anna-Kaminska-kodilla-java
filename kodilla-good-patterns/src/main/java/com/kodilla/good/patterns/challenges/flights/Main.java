package com.kodilla.good.patterns.challenges.flights;

public class Main {
    public static void main(String[] args) {

        ConnectedFlightSearcher connectedFlightSearcher = new ConnectedFlightSearcher();

        connectedFlightSearcher.searchByStartPoint("Warszawa");
        connectedFlightSearcher.searchByEndPoint("Warszawa");

    }
}
