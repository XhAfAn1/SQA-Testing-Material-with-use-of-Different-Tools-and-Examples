package Timer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimerUtilTest {
    private final TimerUtil timer = new TimerUtil();

    @Test
    void testNormalCase() {
        assertEquals(15, timer.secondsBetween(10, 25));
    }

    @Test
    void testBoundaryCase() {
        assertEquals(0, timer.secondsBetween(0, 0));
    }

    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> timer.secondsBetween(20, 10));
    }
}
