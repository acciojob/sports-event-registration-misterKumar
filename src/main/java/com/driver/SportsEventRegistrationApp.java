package com.driver;

public class SportsEventRegistrationApp {
    public static void main(String[] args) {
        SportsEventRegistration registrationSystem = new SportsEventRegistration();

        registrationSystem.registerParticipant("Football", "John");
        registrationSystem.registerParticipant("Basketball", "Alice");
        registrationSystem.registerParticipant("Tennis", "Bob");

        registrationSystem.displayParticipants();

        registrationSystem.cancelRegistration("Football", "John");
        registrationSystem.cancelRegistration("Cricket", "Alice"); // Invalid event name

        registrationSystem.displayParticipants();
    }
}

