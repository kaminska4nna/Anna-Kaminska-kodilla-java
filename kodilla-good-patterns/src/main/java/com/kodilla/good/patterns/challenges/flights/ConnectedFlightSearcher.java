package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class ConnectedFlightSearcher {
    private final ConnectedFlightsTable connectedFlightsTable = new ConnectedFlightsTable();

    public List<ConnectedFlight> searchByStartPoint(String startPoint) {
        List<ConnectedFlight> connectedFlight = connectedFlightsTable.getList().stream()
                .filter(flights -> flights.getStartPoint().equals(startPoint))
                .collect(Collectors.toList());
        System.out.println("Searching connected flights by Startpoint...");
        connectedFlight.stream()
                .forEach(System.out::println);
        return connectedFlight;
    }

    public List<ConnectedFlight> searchByEndPoint(String endPoint) {
        List<ConnectedFlight> connectedFlight = connectedFlightsTable.getList().stream()
                .filter(flights -> flights.getEndPoint() == endPoint)
                .collect(Collectors.toList());
        System.out.println("Searching connected flights by Endpoint...");
        connectedFlight.stream()
                .forEach(System.out::println);
        return connectedFlight;
    }

}
