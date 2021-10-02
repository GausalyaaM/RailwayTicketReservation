package com.company.railway;

import java.util.List;

public class BookTickets {
    public static void bookTickets(List<Passenger> passengerList) {
        for (int i = 0; i < passengerList.size(); i++) {
            Passenger acc = passengerList.get(i);

            if (Tickets.availableWaitingList == 0) {
                System.out.println("No tickets available");
                return;
            }
            if (acc.getBerthPreference().equals("L") && Tickets.availableLowerBerth > 0 || acc.getBerthPreference().equals("M") && Tickets.availableMiddleBerth > 0 ||
                    acc.getBerthPreference().equals("U") && Tickets.availableUpperBerth > 0) {
                System.out.println("preferred berth available");
                if (acc.getBerthPreference().equals("L")) {
                    System.out.println("lower berth given");
                    TicketBooker.bookTickets(acc, TicketBooker.lowerBerthPosition.get(0), "L");
                    TicketBooker.lowerBerthPosition.remove(0);
                    Tickets.availableLowerBerth--;
                } else if (acc.getBerthPreference().equals("M")) {
                    TicketBooker.bookTickets(acc, TicketBooker.middleBerthPosition.get(0), "M");
                    TicketBooker.middleBerthPosition.remove(0);
                    Tickets.availableMiddleBerth--;
                } else if (acc.getBerthPreference().equals("U")) {
                    TicketBooker.bookTickets(acc, TicketBooker.upperBerthPosition.get(0), "U");
                    TicketBooker.upperBerthPosition.remove(0);
                    Tickets.availableUpperBerth--;
                }
            } else if (Tickets.availableLowerBerth > 0) {
                TicketBooker.bookTickets(acc, TicketBooker.lowerBerthPosition.get(0), "L");
                TicketBooker.lowerBerthPosition.remove(0);
                Tickets.availableLowerBerth--;
            } else if (Tickets.availableMiddleBerth > 0) {
                TicketBooker.bookTickets(acc, TicketBooker.middleBerthPosition.get(0), "M");
                TicketBooker.middleBerthPosition.remove(0);
                Tickets.availableMiddleBerth--;
            } else if (Tickets.availableUpperBerth > 0) {
                TicketBooker.bookTickets(acc, TicketBooker.upperBerthPosition.get(0), "M");
                TicketBooker.upperBerthPosition.remove(0);
                Tickets.availableUpperBerth--;
            } else if (Tickets.availableRacTickets > 0) {
                System.out.println("Rac available");
                TicketBooker.addToRac(acc, TicketBooker.racListPosition.get(0), "RAC");
                TicketBooker.racListPosition.remove(0);
                Tickets.availableRacTickets--;
            } else if (Tickets.availableWaitingList > 0) {
                System.out.println("added to waiting list");
                TicketBooker.addToWaitingList(acc, TicketBooker.waitingListPosition.get(0), "WL");
                TicketBooker.waitingListPosition.remove(0);
                Tickets.availableWaitingList--;
            }
        }
    }
}
