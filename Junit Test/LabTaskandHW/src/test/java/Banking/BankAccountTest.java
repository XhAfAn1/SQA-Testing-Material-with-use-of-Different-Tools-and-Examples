package Banking;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private final BankAccount account = new BankAccount();

    @Test
    void testDepositPositive() {
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    void testWithdrawValid() {
        account.deposit(200);
        account.withdraw(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    void testWithdrawBeyondBalance() {
        assertThrows(IllegalStateException.class, () -> account.withdraw(500));
    }

    @Test
    void testDepositNegative() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-100));
    }
}
