package week04_01_10_2022;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter int");
        int intValue = scanner.nextInt();
        System.out.println("intValue = " + intValue);



        System.out.println("Enter double");
        double doubleValue = scanner.nextDouble();
        System.out.println("doubleValue = " + doubleValue);
        scanner.nextLine();

        System.out.println("Enter String");
        String stringValue = scanner.nextLine();
        System.out.println("stringValue = " + stringValue);

        System.out.println("Enter int");
        int intValue1 = scanner.nextInt();
        System.out.println("intValue = " + intValue1);





    }
}
