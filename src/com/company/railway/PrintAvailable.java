package com.company.railway;

public class PrintAvailable {
    public static void printAvailableTickets(){
        System.out.println("available lower berth "+Tickets.availableLowerBerth);
        System.out.println("available middle berth "+Tickets.availableMiddleBerth);
        System.out.println("available upper berth "+Tickets.availableUpperBerth);
        System.out.println("available rac "+Tickets.availableRacTickets);
        System.out.println("available waitingList "+Tickets.availableWaitingList);
    }
}
