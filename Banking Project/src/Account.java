/* Name: Mina Shehata
        # Date: 9/26/2022
        # Class: CSC 1120
        # Pledge: I have neither given nor received unauthorized aid on this
      program.
        # Description: The Bank Account Class allows for updates and
      modification to the child classes.
        # Input: The user can can use constructors to instantiate objects, deposit or withdraw money, and use accessor/mutator methods.
        # Output: This class will not output anythings, but can mutate properties and create objects.
        */

public class Account {
    //instantiation of variables linked to every account
    String name;
    long taxID;
    double balance;
    double[] last10withdraws = new double[10];
    double[] last10deposits = new double[10];
    int numdeposits = 0;
    int numwithdraws = 0;

    //constructors for Account class
    public Account(){
    }

    public Account(String s, long y, double w){
        name = s;
        taxID = y;
        balance = w;
    }

    //creating mutator methods
    public void setName(String yuh){
        name = yuh;
    }
    public void setTaxID(long yuh){
        taxID = yuh;
    }
    public void setBalance(double yuh){
        balance = yuh;
    }

    //creating accessor methods
    public String getName(){
        return name;
    }
    public long getTaxID(){
        return taxID;
    }
    public double getBalance(){
        return balance;
    }

    //method to adjust deposit and put it into balance
    public void MakeDeposit(double money){
        balance += money;
        last10deposits[numdeposits] = money;
        numdeposits++;
    }
    //method to adjust withdraw and remove it from balance
    public void MakeWithdraw(double money){
        balance = balance - money;
        last10withdraws[numwithdraws] = money;
        numwithdraws++;
    }

    //method to display name, taxID, and balance
    public void display(){
        System.out.println("Name:" + name);
        System.out.println("Tax ID:" + taxID);
        System.out.println("Balance:" + balance);
    }

}
