package week05_10_09_2022;

public class StringIntro {
    public static void main(String[] args) {
        //1. literal
        String str = "Kazim"; // String pool memory
        String str1 = "Kazim";
        System.out.println(str == str1);

        //2.
        String str2 = new String("Kazim");
        String str3 = new String("Kazim");
        System.out.println(str2==str3);
        System.out.println(str2.equals(str3));



    }
}
