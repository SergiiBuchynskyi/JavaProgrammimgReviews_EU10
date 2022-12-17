package week15_12_17_2022.bank;

public class GarantiBank extends Bank{

    public void calculateTheInterest() {
        System.out.println("Interest of the " + getClass().getSimpleName() + " " + getAmount()*7/100);
    }
}
