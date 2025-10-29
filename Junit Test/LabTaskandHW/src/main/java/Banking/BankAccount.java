package Banking;

public class BankAccount {
    private double balance;

    public void deposit(double amt) {
        if (amt < 0) throw new IllegalArgumentException("Negative deposit not allowed");
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt > balance) throw new IllegalStateException("Insufficient balance");
        balance -= amt;
    }

    public double getBalance() {
        return balance;
    }
}
