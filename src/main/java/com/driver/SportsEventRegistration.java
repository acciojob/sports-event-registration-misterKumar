package com.driver;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SportsEventRegistration {

    private static final Logger LOGGER = Logger.getLogger(SportsEventRegistration.class.getName());

    private Map<String, String> registeredParticipants;

    public SportsEventRegistration() {
        registeredParticipants = new HashMap<>();
    }
    
    public Map<String, String> getRegisteredParticipants() {
    	//your code goes here
        return registeredParticipants;
    }
    
    public void registerParticipant(String eventName, String participantName) {
    	//your code goes here
    }

    public void displayParticipants() {
    	//your code goes here
    }

    public void cancelRegistration(String eventName, String participantName) {
    	//your code goes here
    }

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

