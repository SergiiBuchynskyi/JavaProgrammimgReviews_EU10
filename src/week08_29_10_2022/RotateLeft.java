package week08_29_10_2022;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {

        int [] x = {1,2,3};

        int temp = x[0];
        for (int i = 0; i < x.length; i++) {
            if (i == x.length-1){
                x[i] = temp;
               break;
            }
            x[i] = x[i+1];
        }
        System.out.println(Arrays.toString(x));
Arrays.sort(x);
    }
}
