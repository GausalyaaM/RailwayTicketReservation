package com.company.railway;
import java.util.*;
public class TicketBooker {
    static Queue<Integer> waitingList=new LinkedList<>();
    static Queue<Integer> racList=new LinkedList<>();
    static List<Integer> bookedTicketList=new ArrayList<>();
    static List<Integer> lowerBerthPosition=new ArrayList<>(Arrays.asList(1,4,7,10,13,16,19,22,25,28,31,34,37,40,43,46,49,52,55,58,61));
    static List<Integer> middleBerthPosition=new ArrayList<>(Arrays.asList(2,5,8,11,14,17,20,23,26,29,32,35,38,41,44,47,50,53,56,59,62));
    static List<Integer> upperBerthPosition=new ArrayList<>(Arrays.asList(3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54,57,60,63));
    static List<Integer> racListPosition=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18));
    static List<Integer> waitingListPosition=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    static Map<Integer,Passenger> passengers=new HashMap<>();
    public static void bookTickets(Passenger p, int berthInfo, String allottedBerth){
        p.setNumber(berthInfo);
        p.setAllotted(allottedBerth);
        passengers.put(p.getPassengerId(),p);
        bookedTicketList.add(p.getPassengerId());
        System.out.println("-----------------Booked successfully");
    }
    public static void addToRac(Passenger p,int racInfo,String allottedBerth){
        p.setNumber(racInfo);
        p.setAllotted(allottedBerth);
        passengers.put(p.getPassengerId(),p);
        racList.add(p.getPassengerId());
        System.out.println("---------------added to rac successfully");
    }
    public static void addToWaitingList(Passenger p,int waitingListInfo,String allottedBerth){
        p.setNumber(waitingListInfo);
        p.setAllotted(allottedBerth);
        passengers.put(p.getPassengerId(),p);
        waitingList.add(p.getPassengerId());
        System.out.println("------------added to waiting list successfully");
    }
}

