package week07_22_10_2022;

import java.util.Scanner;

public class T3_ {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve a room? yes/no");

        String reserv = scan.next().toLowerCase();

        while (!(reserv.equals("yes") || reserv.equals("no"))) {
            System.out.println("Reenter yes or no");
            reserv = scan.next().toLowerCase();
        }
        if (reserv.equals("no")) {
            System.out.println("Have a nice day");
        } else {
            System.out.println("Which type of room you want to reserve?");
            System.out.println("King Bed ==> 120$");
            System.out.println("Queen Bed ==> 100$");
            System.out.println("Single Bed ==> 80$");
            String room = scan.nextLine().toLowerCase();

            while (!(room.equals("king bed") || room.equals("queen bed") || room.equals("single bed"))) {
                System.out.println("Reenter name of room");
                room = scan.nextLine().toLowerCase();
            }

            System.out.println("Enter a quantity of night");
            int night = scan.nextInt();

            int price = 0;
            if (room.equals("king bed")) {
                price = night * 120;
            } else if (room.equals("queen bed")) {
                price = night * 100;

            } else {
                price = night * 80;
            }

            System.out.println("You ordered " + room + "room for " + night + "\nTotal cost is " + price + "$");
        }

    }
}
