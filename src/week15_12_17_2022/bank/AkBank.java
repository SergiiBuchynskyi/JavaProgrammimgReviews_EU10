package week15_12_17_2022.bank;

import java.util.Random;

public class AkBank extends Bank{

    @Override
    public void calculateTheInterest() {
        System.out.println("Interest of the " + getClass().getSimpleName() + " " + getAmount()*8/100);
    }


}
