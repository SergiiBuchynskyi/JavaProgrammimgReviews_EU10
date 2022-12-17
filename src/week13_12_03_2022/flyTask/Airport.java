package week13_12_03_2022.flyTask;

import java.util.ArrayList;

public class Airport {

    static FlightTicket [] ticketList;

    static {

        FlightTicket ticket1 = new FlightTicket("first", "Chicago", "Virgina");
        FlightTicket ticket2 = new FlightTicket("business", "New York", "Miami");
        FlightTicket ticket3 = new FlightTicket("first", "Kyiv", "Donetsk");
        FlightTicket ticket4 = new FlightTicket("economy", "Paris", "Berlin");
        FlightTicket ticket5 = new FlightTicket("first", "Madrid", "London");
        FlightTicket ticket6 = new FlightTicket("economy", "London", "Lisbon");
        FlightTicket ticket7 = new FlightTicket("first", "Chicago", "Paris");
        FlightTicket ticket8 = new FlightTicket("economy", "Chicago", "London");
        FlightTicket ticket9 = new FlightTicket("economy", "Chicago", "Berlin");
        FlightTicket ticket10 = new FlightTicket("business", "Rome", "Virgina");


        ticketList = new FlightTicket[]{ticket1, ticket2, ticket3, ticket4, ticket5,
                ticket6, ticket7, ticket8, ticket9, ticket10};
    }


    public static ArrayList<FlightTicket> firstType(FlightTicket[] ticketList) {
        ArrayList<FlightTicket> result = new ArrayList<>();
        for (FlightTicket flightTicket : ticketList) {
            if (flightTicket.getType().equals("first")) {
                result.add(flightTicket);
            }
        }
        return result;
    }

    public static  ArrayList<FlightTicket> formChicago(FlightTicket[] ticketList){
        ArrayList<FlightTicket> result = new ArrayList<>();
        for (FlightTicket flightTicket : ticketList) {
            if (flightTicket.getDeparture().equals("Chicago")){
                result.add(flightTicket);
            }
        }return result;
    }


    public static void main(String[] args) {
        System.out.println(firstType(ticketList));
        System.out.println(formChicago(ticketList));
    }


}
