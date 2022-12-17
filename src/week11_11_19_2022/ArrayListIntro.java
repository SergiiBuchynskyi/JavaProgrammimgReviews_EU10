package week11_11_19_2022;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class ArrayListIntro {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("London");
        cities.add("Paris");
        cities.add("Berlin");
        cities.add("Warsaw");
        cities.add(1,"Istanbul");
        System.out.println("cities = " + cities);

        cities.set(1, "Lisboa");
        System.out.println("cities = " + cities);


    }

}
