package week05_10_09_2022;

public class StringMethods {
    public static void main(String[] args) {

       /* Task 1: Given a string, print the string made
        of its first two chars, so the String "Hello" yields “HE".
*/
        String str = "Hello";
        System.out.println(""+str.toUpperCase().charAt(0)+str.toUpperCase().charAt(1));
    }
}
