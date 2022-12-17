package week03_24_09_2022;

public class IntroPreIncrementDecrement {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("a= " + a);
        System.out.println(++a);//6
        System.out.println(a++);//6

        int x = 10;

        int number = x++ + 100; // 110
        System.out.println("number = " + number);

        int number2 = ++x + 100; //112
        System.out.println("number2 = " + number2);

    }
}
