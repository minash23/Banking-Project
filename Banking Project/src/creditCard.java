/* Name: Mina Shehata
        # Date: 9/26/2022
        # Class: CSC 1120
        # Pledge: I have neither given nor received unauthorized aid on this
      program.
        # Description: The checking class allows for an extension to the bank account and creates a checking account.
        # Input: Users can input debit charges or make payments on their credit card.
        # Output: The display will output a history of withdrawals and deposit record
        */


public class creditCard extends Account{
    //constructors for checking class
    public creditCard(){
        super();
    }
    public creditCard(String s, long y, double h){
        super(s, y, h);
    }

    //Instantiation of variables
    long cardNumber;
    String[] last10charges = new String[10];
    double[] last10creditAmounts = new double[10];
    int cardCount = 0;

    //method to adjust balance and list withdraw due to a debit
    public void debitCharge(String name, double amount){
        MakeWithdraw(amount);
        last10charges[cardCount] = name;
        last10creditAmounts[cardCount] = amount;
        cardCount++;
    }

    //method to make a payment by deposit
    public void makePayment(double amount){
        MakeDeposit(amount);
        balance = balance - (amount * 2);
    }

    //method to display account charges and deposit record
    public void display(){
        System.out.println("Account Withdrawal: ");
        for (int i = 0; i < last10withdraws.length; i++) {
            if (last10withdraws[i] > 0.0) {
                System.out.println("Withdraw " + (i+1) + ": " + last10withdraws[i]);
            } else {
                System.out.println("No more withdrawals.");
                break;
            }
        }
        System.out.println("Deposit Record: ");
        for (int i = 0; i < last10deposits.length; i++) {
            if (last10deposits[i] > 0.0) {
                System.out.println("Deposit " + (i+1) + ": " + last10deposits[i]);
            } else {
                System.out.println("No more Deposits.");
                break;
            }
        }
    }
}
