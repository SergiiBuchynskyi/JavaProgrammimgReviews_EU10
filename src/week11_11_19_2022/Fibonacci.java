package week11_11_19_2022;

public class Fibonacci {

    /*Task 6 :  Fibonacci

                Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.

                Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

                Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

                    Ex:
                        Input:
                            8
                        Output:
                            0, 1, 1, 2, 3, 5, 8, 13, 21

                            1- Create one method and only print the numbers
                            2- You will return the numbers
                            3- Yuo will put that numbers into the array then you will return it

     */


    static int fib1(int n) {
        if (n <= 1)
            return n;
        return fib1(n - 1) + fib1(n - 2);
    }


    public static void main(String[] args) {
        System.out.println(fib1(10));

    }
}



