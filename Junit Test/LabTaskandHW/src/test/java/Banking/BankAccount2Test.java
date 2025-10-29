package Banking;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccount2Test {

    @Test
    void testValidDeposit() {
        BankAccount2 acc = new BankAccount2();
        acc.deposit(500);
        assertEquals(500, acc.getBalance());
        assertTrue(acc.isActive());
    }

    @Test
    void testOverdraft() {
        BankAccount2 acc = new BankAccount2();
        assertThrows(IllegalStateException.class, () -> acc.withdraw(50));
    }

    @Test
    void testNegativeDeposit() {
        BankAccount2 acc = new BankAccount2();
        assertThrows(IllegalArgumentException.class, () -> acc.deposit(-100));
    }

    @Test
    void testInactivityAfterWithdrawal() {
        BankAccount2 acc = new BankAccount2();
        acc.deposit(150);
        acc.withdraw(100);
        assertFalse(acc.isActive());
    }

    @Test
    void testMultipleTransactions() {
        BankAccount2 acc = new BankAccount2();
        acc.deposit(200);
        acc.withdraw(50);
        assertEquals(150, acc.getBalance());
        assertTrue(acc.isActive());
    }
}
