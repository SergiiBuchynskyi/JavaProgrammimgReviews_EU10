package week10_12_11_2022;

import java.util.Arrays;

public class HidePasswords {
    public static void main(String[] args) {

        String[] arr = {"one", "hi", "hold"};

        String[] results = hidePassword(arr);
        System.out.println(Arrays.toString(results));

    }

    private static String[] hidePassword(String[] arr) {
        int index = 0;
        String []results = new String [arr.length];
        for (String each : arr) {
            String result = convertLetterToStar(each);
            results[index++] = result;
        }
        return results;
    }

    private static String convertLetterToStar(String each) {
        String temp = "";
        for (int i = 0; i < each.length(); i++) {
            temp += "*";
        }
        return temp;


    }


}
