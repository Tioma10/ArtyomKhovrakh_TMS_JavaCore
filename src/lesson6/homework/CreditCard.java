package lesson6.homework;

public class CreditCard {
    public String accountNumber;
    public int currentAmount;


    public CreditCard(String accountNumber, int currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    public void getInformation() {
        System.out.println("This account number is: " + this.accountNumber + "\nCurrent amount in account number is: "
                + this.currentAmount);
    }

    public void withdrawMoney(int withdrawalAmount) {
        if (this.currentAmount<withdrawalAmount){
            System.out.println("Not enough funds");
        }
        else{
            this.currentAmount -= withdrawalAmount;
        }
    }

    public void topUpYourAccount(int replenishmentAmount)
    {
        this.currentAmount += replenishmentAmount;
    }


}
