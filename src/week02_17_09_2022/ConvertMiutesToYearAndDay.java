package week02_17_09_2022;

public class ConvertMiutesToYearAndDay {
    public static void main(String[] args) {

        /*8. Create class named ConvertMiutesToYearAndDay, write a Java program to convert minutes into a number of years and days.

     Input the number of minutes: 3456789
     Expected Output :
     3456789 minutes is approximately 6 years and 210 days
              */

        int minutes = 687468768;
        int yearMinutes = 365*24*60;

        int x = minutes / yearMinutes;
        int y = minutes % yearMinutes/(24*60);

        System.out.println("In " + minutes + " there is " + x + " years and " + y + "days");


    }
}
