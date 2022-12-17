package week04_01_10_2022;

import java.util.Scanner;

public class EligibleToDonate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter age ");
        int age = input.nextInt();

        System.out.println("Enter weight ");
        int weight = input.nextInt();

        if (age >= 18){
            if (weight >= 50){
                System.out.println("you are eligible to donate blood");
            }
            else {
                System.out.println("To low weight to donate blood");
            }
        }else {
            System.out.println("Age must be more than 18");
        }



    }
}
