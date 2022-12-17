package week03_24_09_2022;

public class FindTheResult {
    public static void main(String[] args) {
        int a = 15;
        if (a % 3 == 0){
            a+=20;
        } else if (a % 5 == 0) {
            a+=25;
        } else if (a % 15 == 0) {
            a+=50;
        }
    }
}
