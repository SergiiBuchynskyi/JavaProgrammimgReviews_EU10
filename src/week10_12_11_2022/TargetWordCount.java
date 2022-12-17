package week10_12_11_2022;

public class TargetWordCount {
    public static void main(String[] args) {

        String []array = {"java", "html"};
        String target = "java";

        int result = countTheWordInArray(array,target);
        System.out.println(result);


    }

    private static int countTheWordInArray(String[]array, String target) {
        int count = 0;

        for (String each : array) {
            if (each.equals(target)){
                count++;
            }

        }
        return count;
    }
}
