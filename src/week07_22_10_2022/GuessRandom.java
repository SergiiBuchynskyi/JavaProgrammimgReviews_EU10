package week07_22_10_2022;

import java.util.Random;
import java.util.Scanner;

public class GuessRandom {
    public static void main(String[] args) {
        //-- Task 1: Find the number taht given a hidden number between 1 and 100 randomly created.
        //
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int hiddenNumber = random.nextInt(100) + 1;
        int num = 0;
        int count = 0;

        do {
            System.out.println("Enter number from 1 to 100");
            num = scan.nextInt();
            count++;
            System.out.println("Attempt "+ count);
            if (num>hiddenNumber){
                System.out.println("smaller");
                count++;
            }else {
                System.out.println("bigger");
            }
        }while (num != hiddenNumber);
        System.out.println("Bingo!");
    }
}
