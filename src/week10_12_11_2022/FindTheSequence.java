package week10_12_11_2022;

public class FindTheSequence {
    public static void main(String[] args) {

        String str = "akld sj0238 7490 87()**&R% (*#$%@*GYD*G@ CG&#@ BC*@B O(UN@#O(&TY$&";
        getSentence(str);




    }
    public static void getSentence(String str){
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (c.isAlphabetic(c) || c == ' '){
                temp+=c;
            }

        }
        System.out.println(temp);


    }
}
