package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearcher {
    private final FlightsTable flightsTable = new FlightsTable();

    public List<ConnectedFlight> searchByStartPoint(String startPoint) {
        List<ConnectedFlight> connectedFlight = flightsTable.getList().stream()
                .filter(flights -> flights.getStartPoint().equals(startPoint))
                .collect(Collectors.toList());
        System.out.println("Searching connected flights by Startpoint...");
        connectedFlight.stream()
                .forEach(System.out::println);
        return connectedFlight;
    }

    public List<ConnectedFlight> searchByEndPoint(String endPoint) {
        List<ConnectedFlight> connectedFlight = flightsTable.getList().stream()
                .filter(flights -> flights.getEndPoint() == endPoint)
                .collect(Collectors.toList());
        System.out.println("Searching connected flights by Endpoint...");
        connectedFlight.stream()
                .forEach(System.out::println);
        return connectedFlight;
    }
    public List<ConnectedFlight> searchByConnectionPoint(String connectionPoint) {
        List<ConnectedFlight> connectedFlight = flightsTable.getList().stream()
                .filter(flights -> flights.getConnectPoint() == connectionPoint)
                .collect(Collectors.toList());
        System.out.println("Searching connected flights by connection Point...");
        connectedFlight.stream()
                .forEach(System.out::println);
        return connectedFlight;
    }
}
