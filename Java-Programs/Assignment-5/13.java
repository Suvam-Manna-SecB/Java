/* Design a class named Account that contains:
A private int data field named id for the account (default 0).
A private double data field named balance for the account (default 0).
A private double data field named annualInterestRate that stores the cur-rent interest rate (default 0). Assume all accounts have the same interest rate.
A private Date data field named dateCreated that stores the date when the account was created.
A no-arg constructor that creates a default account.
A constructor that creates an account with the specified id and initial balance.
The accessor and mutator methods for id, balance, and annualInterestRate.
The accessor method for dateCreated.
A method named getMonthlyInterestRate() that returns the monthly interest rate.
A method named getMonthlyInterest() that returns the monthly interest.
A method named withdraw that withdraws a specified amount from the account.
A method named deposit that deposits a specified amount to the account.
*/

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        this(0, 0);
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
