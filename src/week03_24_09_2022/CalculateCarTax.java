package week03_24_09_2022;

public class CalculateCarTax {
    public static void main(String[] args) {

        int price = 50000;

        if (price <39999 && price >20000){
            System.out.println("taxRate = 0.2");
        } else if (price <59999  && price >40000 ){
            System.out.println("taxRate = 0.3");
        } else if (price <80000  && price >60000  ){
            System.out.println("taxRate = 0.4");
        }




    }
}
