package week13_12_03_2022.flyTask;


import java.lang.reflect.Array;
import java.util.Arrays;


public class FlightTicket {

    private String type; //first, business, economy
    private String departure; // location/airport
    private String arrival; // location/airport

    public String getType() {
        return type;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }


    public void setType(String type) {
        String [] listOfTypes = {"first", "business", "economy"};
        if(Arrays.asList(listOfTypes).contains(type)){
            this.type = type;
        }else {
            System.err.println("Wrong type");
        }

    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public FlightTicket(String type, String departure, String arrival) {
        this.setType(type);
        this.departure = departure;
        this.arrival = arrival;
    }


    @Override
    public String toString() {
        return "FlightTicket{" +
                "type='" + type + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
/*
FlightTicket Task

 declare these instance variables in FlightTicket class:
            type(first, business, economy
            departure location/airport
            arrival location/airport

         encapsulate all of them

         create constructor to set up the object

            Note: type should only be first, business, or economy

________________________________________


Then create 10 objects in Airport class in static block

Examples :

  FlightTicket ticket1 = new FlightTicket("first", "Chicago", "Virgina");
  FlightTicket ticket1 = new FlightTicket("business", "Chicago", "Virgina");
  .
  .
  .

Tasks:

1- create a method returns list of flight tickets are first as type (try to make it dynamic)
2- create a method returns list of flight tickets are from Chicago   (try to make it dynamic)
 */