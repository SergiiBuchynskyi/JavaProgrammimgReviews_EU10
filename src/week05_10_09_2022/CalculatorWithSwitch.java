package week05_10_09_2022;

import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double number1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double number2 = scanner.nextDouble();

        System.out.println("Enter operator:");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("wrong operator");
        }
        System.out.printf("result = " + result);




    }
}