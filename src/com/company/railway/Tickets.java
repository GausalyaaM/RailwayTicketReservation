package com.company.railway;

public class Tickets {
    static int availableLowerBerth=21;
    static int availableUpperBerth=21;
    static int availableMiddleBerth=21;
    static int availableRacTickets=18;
    static int availableWaitingList=10;

    public static int getAvailableLowerBerth() {
        return availableLowerBerth;
    }

    public static void setAvailableLowerBerth(int availableLowerBerth) {
        Tickets.availableLowerBerth = availableLowerBerth;
    }

    public static int getAvailableUpperBerth() {
        return availableUpperBerth;
    }

    public static void setAvailableUpperBerth(int availableUpperBerth) {
        Tickets.availableUpperBerth = availableUpperBerth;
    }

    public static int getAvailableMiddleBerth() {
        return availableMiddleBerth;
    }

    public static void setAvailableMiddleBerth(int availableMiddleBerth) {
        Tickets.availableMiddleBerth = availableMiddleBerth;
    }

    public static int getAvailableRacTickets() {
        return availableRacTickets;
    }

    public static void setAvailableRacTickets(int availableRacTickets) {
        Tickets.availableRacTickets = availableRacTickets;
    }

    public static int getAvailableWaitingList() {
        return availableWaitingList;
    }

    public static void setAvailableWaitingList(int availableWaitingList) {
        Tickets.availableWaitingList = availableWaitingList;
    }
}

