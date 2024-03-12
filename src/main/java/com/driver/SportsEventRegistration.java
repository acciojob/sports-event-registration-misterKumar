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
        registeredParticipants.put(eventName, participantName);
        LOGGER.log(Level.INFO, participantName + " registered for the event " + eventName);
    }

    public void displayParticipants() {
    	//your code goes here
        if (registeredParticipants.isEmpty()) {
            LOGGER.log(Level.WARNING, "No participants registered for any event.");
            return;
        }

        LOGGER.log(Level.INFO, "Registered Participants:");
        for (Map.Entry<String, String> entry : registeredParticipants.entrySet()) {
            LOGGER.log(Level.INFO, entry.getKey() + ": " + entry.getValue());
        }
    }

    public void cancelRegistration(String eventName, String participantName) {
    	//your code goes here
        if (!registeredParticipants.containsKey(eventName) || !registeredParticipants.get(eventName).equals(participantName)) {
            LOGGER.log(Level.SEVERE, "Error: No registration found for " + participantName + " in the event " + eventName);
            return;
        }

        registeredParticipants.remove(eventName);
        LOGGER.log(Level.WARNING, participantName + " canceled registration for the event " + eventName);
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

