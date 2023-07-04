/* Name: Mina Shehata
        # Date: 9/26/2022
        # Class: CSC 1120
        # Pledge: I have neither given nor received unauthorized aid on this
      program.
        # Description: The savings class allows for an extension to the bank account and creates a savings account.
        # Input: User can input a withdrawal or deposit into their savings account.
        # Output: The display will output a history of withdrawals and deposit record.
        */


public class Savings extends Account {
    //constructors for savings class
    public Savings() {
        super();
    }

    public Savings(String s, long y, double h) {
        super(s, y, h);
    }

    //method to withdraw money
    public void doWithdraw(double amount) {
        MakeWithdraw(amount);
    }

    //method to display account withdrawal and deposit record
    public void display() {
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
