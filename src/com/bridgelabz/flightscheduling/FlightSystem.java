package com.bridgelabz.flightscheduling;

public class FlightSystem {
    public static void main(String[] args) {
        Flight<Integer> flight1 = new Flight<>(101, "New York", "London");
        Flight<String> flight2 = new Flight<>("A102", "Los Angeles", "Tokyo");

        com.bridgelabz.flightscheduling.Booking<Integer> booking1 = new com.bridgelabz.flightscheduling.Booking<>(1011, flight1, "Olivia Smith");
        com.bridgelabz.flightscheduling.Booking<String> booking2 = new com.bridgelabz.flightscheduling.Booking<>("B1012", flight2, "Jane Williams");

        booking1.displayBookingDetails();
        System.out.println("----------------");
        booking2.displayBookingDetails();

        System.out.println("\n--- Flight Management ---");
        com.bridgelabz.flightscheduling.FlightManager<Integer> manager1 = new com.bridgelabz.flightscheduling.FlightManager<>();
        manager1.addFlight(flight1);

        com.bridgelabz.flightscheduling.FlightManager<String> manager2 = new com.bridgelabz.flightscheduling.FlightManager<>();
        manager2.addFlight(flight2);

        manager1.displayAllFlights();
        manager2.displayAllFlights();
    }
}
