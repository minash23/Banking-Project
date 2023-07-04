/* Name: Mina Shehata
        # Date: 9/26/2022
        # Class: CSC 1120
        # Pledge: I have neither given nor received unauthorized aid on this
      program.
        # Description: The checking class allows for an extension to the bank account and creates a checking account.
        # Input: Main method to run classes and banking app.
        # Output: Prints Banking interface and displays deposit records, withdrawal records, check records, etc.
        */

import java.util.Scanner;

//creating new class bank
public class Bank {
    //creating functions that out prints interface
    public static void screenShow() {
        System.out.println("Welcome to Bank of Mina.");
        System.out.println("*****************************");
        System.out.println("What would you like to do?");
        System.out.println("1. Savings Deposit");
        System.out.println("2. Savings Withdrawal");
        System.out.println("3. Checking Deposit");
        System.out.println("4. Write a check");
        System.out.println("5. Credit Card Payment");
        System.out.println("6. Make a Charge");
        System.out.println("7. Display Savings");
        System.out.println("8. Display Checking");
        System.out.println("9. Display Credit Card");
        System.out.println("10. Exit");
        System.out.println("Enter Number Here: ");
    }

    public static void main(String[] args) {

        //instantiation of objects and variables
        Savings minaSavings = new Savings("Mina's Savings Account", 67093803, 100.00);
        Checking minaCheckings = new Checking("Mina's Checkings Account", 67093803, 100.00);
        creditCard minaCredit = new creditCard("Mina's Credit Account", 67093803, 100.00);

        //call to interface function
        screenShow();

        //creating scanner and variable for user input
        Scanner hey = new Scanner(System.in);
        int opt = 0;

        //while loop that contains all possible actions of banking app
        //contains if statement for every value from 1-10 and different functions are called based on opt value
        while (opt != 10) {
            opt = hey.nextInt();

            //input 1
            if (opt == 1) {
                System.out.println("How much would you like to deposit into your saving?");
                opt = hey.nextInt();
                minaSavings.MakeDeposit(opt);
                System.out.println("You just deposited " + opt + " dollars! Press 0 to go back.");
                opt = hey.nextInt();
                if (opt == 0) {
                    screenShow();
                }
            }
            //input 2
            if (opt == 2) {
                System.out.println("How much would you like to withdraw?");
                opt = hey.nextInt();
                minaSavings.doWithdraw(opt);
                System.out.println("You just withdrew " + opt + " dollars! Press 0 to go back.");
                opt = hey.nextInt();
                if (opt == 0) {
                    screenShow();
                }
            }
            //input 3
            if (opt == 3) {
                System.out.println("How much would you like to deposit into your checking?");
                opt = hey.nextInt();
                minaCheckings.MakeDeposit(opt);
                System.out.println("You just deposited " + opt + " dollars! Press 0 to go back.");
                opt = hey.nextInt();
                if (opt == 0) {
                    screenShow();
                }
            }
            //input 4
            if (opt == 4) {
                System.out.println("Please enter your check number and amount.");
                System.out.println("Check Number:");
                int numm = hey.nextInt();
                System.out.println("Amount: ");
                opt = hey.nextInt();
                minaCheckings.writeCheck(numm,opt);
                System.out.println("You just wrote check " + numm + " for an amount of: " + opt + " dollars! Press 0 to go back.");
                opt = hey.nextInt();
                if (opt == 0) {
                    screenShow();
                }
            }
            //input 5
            if (opt == 5) {
                System.out.println("How much of your credit card balance would you like to pay? Your current balance is " + minaCredit.balance + " dollars");
                opt = hey.nextInt();
                minaCredit.makePayment(opt);
                System.out.println("You just made a payment of " + opt + " dollars on your credit balance! Press 0 to go back.");
                opt = hey.nextInt();
                if (opt == 0) {
                    screenShow();
                }
            }
            //input 6
            if (opt == 6) {
                System.out.println("Please enter the name of your charge.");
                String yes = hey.next();
                System.out.println("Please enter amount of charge.");
                opt = hey.nextInt();
                minaCredit.debitCharge(yes, opt);
                System.out.println("You just made charge " + yes + " for " + opt + "dollars! Press 0 to go back");
                opt = hey.nextInt();
                if (opt == 0) {
                    screenShow();
                }
            }
            //input 7
            if (opt == 7){
                minaSavings.display();
                System.out.println("You currently have " + minaSavings.balance + " dollars in your savings balance. Press 0 to go back.");
                opt = hey.nextInt();
                if (opt == 0) {
                    screenShow();
                }
            }
            //input 8
            if (opt == 8){
                minaCheckings.display();
                System.out.println("You currently have " + minaCheckings.balance + " dollars in your checkings balance. Press 0 to go back.");
                opt = hey.nextInt();
                if (opt == 0) {
                    screenShow();
                }
            }
            //input 9
            if (opt == 9){
                minaCredit.display();
                System.out.println("You currently have " + minaCredit.balance + " dollars on your credit balance. Press 0 to go back.");
                opt = hey.nextInt();
                if (opt == 0) {
                    screenShow();
                }
            }
            //input 10
            if (opt == 10){
                System.out.print("Thank you for banking with us! Hope to see you soon.");
            }

        }
    }

}

