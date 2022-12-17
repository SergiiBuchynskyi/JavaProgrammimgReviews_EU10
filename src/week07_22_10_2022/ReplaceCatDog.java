package week07_22_10_2022;

public class ReplaceCatDog {
    public static void main(String[] args) {
        String names = "Adam, Adam, Barry, Aysun";
        String temp = "";
        for (int i = 0; i < names.length(); i++) {
            char ch = names.charAt(i);
            if(ch!=' '){
                temp+=ch;
                continue;
            }
            String search = "Adam";

            int count = 0;

            while (names.contains(search)){
                count++;
                names= names.replace(search,"");
            }
            System.out.println("counter = " + count);

        }

        }





}
