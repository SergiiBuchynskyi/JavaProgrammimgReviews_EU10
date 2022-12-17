package week10_12_11_2022;

public class CountCharacters {

    public static void main(String[] args) {
        String[] words = {"apples", "loop", "tree", "cat", "animal", "shortcut"};

    }

    public static String[] fourOrLess(String[] words) {
        int number = find4Orless(words);
        String []array = new String[number];
        int i =0;
        for (String word : words) {
            if (word.length()<=4){
                array[i++] = word;
            }
        }
        return words;
    }

    public static int find4Orless(String[] words) {
        int count = 0;
        for (String word : words) {
            if (word.length() <= 4) {
                count++;
            }

        }return count;
    }
}