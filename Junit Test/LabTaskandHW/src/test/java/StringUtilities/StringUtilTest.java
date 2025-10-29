package StringUtilities;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {
    private final StringUtil util = new StringUtil();

    @Test
    void testSimplePalindrome() {
        assertTrue(util.isPalindrome("madam"));
    }

    @Test
    void testCaseInsensitive() {
        assertTrue(util.isPalindrome("RaceCar"));
    }

    @Test
    void testNonPalindrome() {
        assertFalse(util.isPalindrome("hello"));
    }

    @Test
    void testNullOrEmpty() {
        assertFalse(util.isPalindrome(null));
        assertFalse(util.isPalindrome(""));
    }
}
