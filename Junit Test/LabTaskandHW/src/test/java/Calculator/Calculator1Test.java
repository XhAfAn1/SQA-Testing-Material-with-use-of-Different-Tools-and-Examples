package Calculator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Calculator1Test {

    private Calculator1 calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator1();
    }

    @AfterEach
    void tearDown() {
        calc = null;
    }

    @Test
    void testBasicOperations() {
        assertEquals(10, calc.add(7, 3));
        assertEquals(4, calc.subtract(7, 3));
        assertEquals(21, calc.multiply(7, 3));
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    void testPower() {
        assertEquals(8.0, calc.power(2, 3), 0.001);
        assertEquals(1.0, calc.power(5, 0), 0.001);
    }

    @Test
    void testModulus() {
        assertEquals(1, calc.modulus(10, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }

    @Test
    void testModulusByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.modulus(9, 0));
    }
}
