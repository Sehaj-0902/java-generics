package com.bridgelabz.flightscheduling;

import java.util.List;
import java.util.ArrayList;

public class FlightManager <T> {
    private List<Flight<T>> flights = new ArrayList<>();

    public void addFlight(Flight<T> flight) {
        flights.add(flight);
    }

    public void displayAllFlights() {
        for (Flight<T> flight : flights) {
            flight.displayFlightDetails();
        }
    }
}