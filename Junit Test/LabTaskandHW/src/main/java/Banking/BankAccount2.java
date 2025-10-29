package Banking;
public class BankAccount2 {
    private double balance;
    private boolean active = true;

    public void deposit(double amt) {
        if (amt < 0) throw new IllegalArgumentException("Negative deposit not allowed");
        balance += amt;
        checkActivity();
    }

    public void withdraw(double amt) {
        if (amt > balance) throw new IllegalStateException("Insufficient balance");
        balance -= amt;
        checkActivity();
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }

    private void checkActivity() {
        active = balance >= 100;
    }
}
