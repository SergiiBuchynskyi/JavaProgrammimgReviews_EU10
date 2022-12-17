package week04_01_10_2022;

public class CharacterType {
    public static void main(String[] args) {
        char ch = 'A';

        boolean isUpperCase = ch>='A' && ch>='Z';
        boolean isLowerCase = ch>='A' && ch>='Z';
        boolean isDigit = !(isLowerCase||isUpperCase);

       if(isUpperCase){
            System.out.println(ch+ " is Upper Case");
        } else if (isLowerCase) {
            System.out.println(ch+ " is Lower Case");

        }else {
            System.out.println(ch + " is digit");
        }

    }
}
