package com.bridgelabz.flightscheduling;

public class Flight <T> {
    private T flightNumber;
    private String departure;
    private String destination;

    public Flight (T flightNumber, String departure, String destination) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
    }

    public T getFlightNumber() {
        return flightNumber;
    }

    public void displayFlightDetails() {
        System.out.println("Flight: " + getFlightNumber() + " | From: " + departure + " | To: " + destination);
    }
}
