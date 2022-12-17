package week11_11_19_2022;

/*
Task 2 :

Create a method that get two arraylists as a parameters the return the array which has contains all elements in it.

input:

first arraylist :1,2,3

second arraylist :4,5,6

output:

1,2,3,4,5,6
 */

import java.sql.Array;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        System.out.println(Arrays.toString(mergeTwoArrays(arr1, arr2)));


    }

    public static int[] mergeTwoArrays(int[] arr1, int[] arr2) {
        int j = 0;
        int[] mergeTwoArrays = new int[arr1.length + arr2.length];
        for (int element : arr1) {
            mergeTwoArrays[j] = element;
            j++;
        }
        for (int element : arr2) {
            mergeTwoArrays[j] = element;
            j++;

        }
        return mergeTwoArrays;
    }
}