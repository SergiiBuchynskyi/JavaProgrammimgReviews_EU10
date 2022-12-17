package week02_17_09_2022;

public class PrimitivesIntro {
    public static void main(String[] args) {
        /*
        Variable Types:
        1-Primitives
         - Numerical
         double > float > long > integer > short > byte
         - boolean
         - char

        2-Non-primitive
        String

        How to declare variables:
        dataType variableName = data;

        Variable name rules:
        1. Must be unique (inside the same block-method)
        2. Lower camelCase
        3. We CAN NOT start with numbers
        4. We CAN NOT use Java Reserved words
        5. For special character (_underscore, $dollar sign)
        6. Make it readable and understandable
         */

        int age = 34;
        // byte myByte = 129; // we can not byte -128 to 127

        short myShort = 12;
        long myLong = 12354354353l; // (add "L" or "l")
        //default data type for compiler is int

        double myDouble = 25.5;
        double myDouble1 = 25;

        float myFloat = (float) 12.5; // add "f"
        //explicit casting done manually by human

        long l = 20;
        int i = (int) l;//explicit casting

        //double d = (double) myFloat;

        //double d = l; // implicit casting done by compiler automatically


        //implicit casting ---> smaller to bigger - automatically
        //explicit casting ---> bigger to smaller - manually int x = (int) y


        //addition
        //n+n=number



    }
}
