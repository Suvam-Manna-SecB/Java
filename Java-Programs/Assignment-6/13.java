/* Write a program to implement the Multiple Inheritance (Bank Interface, Customer & Account classes). */

interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}
class Customer implements Bank {
    private String name;
    private String accountNumber;
    private double balance;
    public Customer(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + balance);
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    public void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}
class Account implements Bank {
    private String accountType;
    private double balance;
    public Account(String accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + balance);
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    public void display() {
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
    }
}
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "123456", 1000);
        customer.deposit(500);
        customer.withdraw(200);
        customer.display();
        System.out.println();
        Account account = new Account("Savings", 2000);
        account.deposit(1000);
        account.withdraw(500);
        account.display();
    }
}
