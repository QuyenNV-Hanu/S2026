package week02;

public class BankAccount {
    private double balance = 0; // optional, mutable, default = 0
    private int transactions = 1; // optional, immutable, default = 1
    private double interestRate = 0.44; // optional, mutable, default = 0.44
    private String holderName; // compulsory, immutable

    public BankAccount(String holderName) {
        this.holderName = holderName;
    }

    public BankAccount(String holderName, double initial) {
        this.balance = initial;
        this.holderName = holderName;
    }

    public void deposit(double amount) {
        this.balance += amount;
        this.transactions++;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        this.transactions++;
    }

    public void monthlyFee() {
        this.withdraw(10);
    }

    public double annualInterest() {
        return this.balance * this.interestRate;
    }

    public String toString() {
        if (this.balance < 0) {
            return this.holderName + ", -$" + Math.abs(this.balance);
        } else {
            return this.holderName + ", $" + Math.abs(this.balance);
        }
    }

    public void transfer(BankAccount destination, double amount) {
        if (this.balance < amount + 0.5) {
            System.out.println("Insufficient funds");
        } else {
            this.withdraw(amount);
            destination.deposit(amount);
            this.balance -= 0.5;
        }
    }

}
