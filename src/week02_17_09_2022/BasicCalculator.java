package week02_17_09_2022;

public class BasicCalculator {
    public static void main(String[] args) {
        //3. Create a class named BasicCalculator.
        // write a Java program to print the sum (addition),
        // multiply, subtract, divide and remainder of two numbers.
        double firstNumber, secondNumber;
        firstNumber = 20;
        secondNumber = 5;

        double addition = firstNumber + secondNumber;
        double substract = firstNumber - secondNumber;
        double multiply = firstNumber * secondNumber;
        double divide = firstNumber / secondNumber;
        double reminder = firstNumber % secondNumber;

        System.out.println("addition = " + addition);
        System.out.println("subtract = " + substract);
        System.out.println("multiply = " + multiply);
        System.out.println("divide = " + divide);
        System.out.println("reminder = " + reminder);

    }

}
