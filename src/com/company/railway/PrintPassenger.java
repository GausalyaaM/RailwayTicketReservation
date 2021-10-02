package com.company.railway;

public class PrintPassenger {
    public static void printPassengerDetails(){
        if(TicketBooker.passengers.size()==0){
            System.out.println("No details");
            return;
        }
        System.out.println("PassengerId"+" "+"passengerName"+" "+"Age"+" "+"berthPreference");
        for(Passenger p:TicketBooker.passengers.values()){
            System.out.println(p);
            System.out.println("------------------------");
        }
    }
}

