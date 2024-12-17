package lesson6.homework;

public class MyMain {
    public static void main(String[] args) {
        CreditCard visaPriorbank = new CreditCard("452555vc4v4", 2000);
        CreditCard masterCardPriorbank = new CreditCard("889555bn494", 10000);
        CreditCard visaBelarusbank = new CreditCard("111689hp594", 20000);
        
        visaPriorbank.topUpYourAccount(2000);
        masterCardPriorbank.topUpYourAccount(6000);
        visaBelarusbank.withdrawMoney(5000);

        visaPriorbank.getInformation();
        masterCardPriorbank.getInformation();
        visaBelarusbank.getInformation();
    }
}
