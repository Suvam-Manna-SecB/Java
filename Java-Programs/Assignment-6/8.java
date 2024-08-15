/* Create an abstract class Accounts with the following details:
Data Members:
Balance  (b) accountNumber  © accountHoldersName  (d) address
Methods:
withdrawal() - abstract
deposit() - abstract
display() - to show the balance of the account number.

Create a subclass of this class SavingsAccount and add the following details:
Data Members:
rateOfInterest
Methods:
calculateAmount()
*/

abstract class Accounts {
    protected double balance;
    protected int accountNumber;
    protected String accountHoldersName;
    protected String address;
    abstract void withdrawal(double amount);
    abstract void deposit(double amount);
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}
class SavingsAccount extends Accounts {
    private double rateOfInterest;
    public SavingsAccount(double rateOfInterest, int accountNumber, String accountHoldersName, String address) {
        this.rateOfInterest = rateOfInterest;
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
        this.balance = 0;
    }
    void calculateAmount() {
        double interest = balance * rateOfInterest / 100;
        double totalAmount = balance + interest;
        System.out.println("Total Amount with Interest: $" + totalAmount);
    }
    @Override
    void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited successfully.");
    }
}
public class AccountsDemo {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(5.0, 123456, "John Doe", "123 Main St");
        savingsAccount.deposit(1000);
        savingsAccount.display();
        savingsAccount.withdrawal(500);
        savingsAccount.display();
        savingsAccount.calculateAmount();
    }
}
