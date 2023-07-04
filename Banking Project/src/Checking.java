/* Name: Mina Shehata
        # Date: 9/26/2022
        # Class: CSC 1120
        # Pledge: I have neither given nor received unauthorized aid on this
      program.
        # Description: The checking class allows for an extension to the bank account and creates a checking account.
        # Input: Users can deposit, withdraw, or write checks from their checking account.
        # Output: The display will output a history of checks and deposits taken from this account.
        */

public class Checking extends Account {
    //instantiation of checks array and variables
    int[] last10checks = new int[10];
    double[] last10checkAmounts = new double[10];
    int checkingCount = 0;

    //constructors for checking class
    public Checking() {
        super();
    }

    public Checking(String s, long y, double h) {
        super(s, y, h);
    }

    //method to write a check by adjusting balance and list as withdraw
    public void writeCheck(int checknum, double amount) {
        MakeWithdraw(amount);
        last10checks[checkingCount] = checknum;
        last10checkAmounts[checkingCount] = amount;
        checkingCount++;
    }

    //method to display the account check register and deposit record
    public void display() {
        System.out.println("Check Register: ");
        for (int i = 0; i < last10checkAmounts.length; i++) {
            if (last10checkAmounts[i] > 0.0) {
                System.out.println("Check " + (i+1) + " number: " + last10checks[i] + " Check " + (i+1) + " amount: " + last10checkAmounts[i]);
            } else {
                System.out.println("No more checks.");
                break;
            }
        }
        System.out.println("Deposit Record: ");
        for (int i = 0; i < last10deposits.length; i++) {
            if (last10deposits[i] > 0.0) {
                System.out.println("Deposit " + (i+1) + ": " + last10deposits[i]);
            } else {
                System.out.println("No more deposits.");
                break;
            }
        }
    }
}
