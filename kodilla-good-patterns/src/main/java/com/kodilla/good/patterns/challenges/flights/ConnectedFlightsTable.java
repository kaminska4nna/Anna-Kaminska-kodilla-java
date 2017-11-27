package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class ConnectedFlightsTable {
    private final List<ConnectedFlight> connectedFlights = new ArrayList<>();

    public ConnectedFlightsTable() {
        connectedFlights.add(new ConnectedFlight("Warszawa", "Londyn", "Berlin"));
        connectedFlights.add(new ConnectedFlight("Warszawa", "Wiedeń", "Wrocław"));
        connectedFlights.add(new ConnectedFlight("Warszawa", "Szczecin", "Gdańsk"));
        connectedFlights.add(new ConnectedFlight("Warszawa", "Gdańsk", "-"));


    }

    public List<ConnectedFlight> getList() {
        return new ArrayList<>(connectedFlights);
    }

}
