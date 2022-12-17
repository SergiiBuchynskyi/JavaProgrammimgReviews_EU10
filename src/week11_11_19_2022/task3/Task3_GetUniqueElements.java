package week11_11_19_2022.task3;


import javax.sql.rowset.serial.SerialArray;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Task3_GetUniqueElements {
/*
Task 3 :

Create a method that get two arrays as a parameters then return the arraylist which has contains unique elements in it.

first array :1,2,3,4,5

second array :4,5,6

output:

1,2,3,4,5,6
 */

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6};

        System.out.println(uniqueList(arr1,arr2));

    }

    public static ArrayList<Integer> uniqueList(int [] arr1, int[] arr2) {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            if (!uniqueList.contains(arr1[i])) {
               uniqueList.add(arr1[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (!uniqueList.contains(arr1[i])) {
                uniqueList.add(arr1[i]);
            }
        }
        return uniqueList;
    }
}