package week15_12_17_2022.bank;



public class TestsInterests {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.calculateTheInterest();

        AkBank akBank = new AkBank();
        akBank.calculateTheInterest();

        GarantiBank garantiBank = new GarantiBank();
        garantiBank.calculateTheInterest();

    }

}
