package week15_12_17_2022.bank;

public class Bank {

    private int amount = 10000;

    public int getAmount(){
        return amount;
    }

    public void calculateInterest(){
        System.out.println("");
    }

    public void calculateTheInterest(){
        System.out.println("Interest of the " + getClass().getSimpleName());
    }

}
