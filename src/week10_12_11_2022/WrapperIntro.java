package week10_12_11_2022;

public class WrapperIntro {

    public static void main(String[] args) {

        Integer a = 10;
        int c = a;
        Integer b = c;


        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(Integer.valueOf(c).getClass().getName());


    }
}


