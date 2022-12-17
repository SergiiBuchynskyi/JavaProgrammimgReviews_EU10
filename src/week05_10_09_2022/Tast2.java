package week05_10_09_2022;

import java.util.Scanner;

public class Tast2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String result = " ";
        for (int i = 0; i < word.length(); i++) {
           result = result.concat(word.charAt(i) + "x");
           }
        System.out.println(result);
        }
        
    }
    
    /*
    Task 9: Given a string password. Encrypt with "x" a given password and print.

    Hint: do with for loop

     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
     */

