package StringUtilities;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringAnalyzerTest {

    private final StringAnalyzer analyzer = new StringAnalyzer();

    @Test
    @DisplayName("Check palindrome detection")
    void testPalindrome() {
        assertTrue(analyzer.isPalindrome("Level"));
        assertFalse(analyzer.isPalindrome("Java"));
    }

    @Test
    @DisplayName("Count vowels in a string")
    void testCountVowels() {
        assertEquals(2, analyzer.countVowels("Hello"));
        assertEquals(0, analyzer.countVowels(""));
        assertEquals(0, analyzer.countVowels(null));
    }

    @Test
    @DisplayName("Check if two words are anagrams")
    void testAnagram() {
        assertTrue(analyzer.isAnagram("listen", "silent"));
        assertFalse(analyzer.isAnagram("test", "text"));
        assertFalse(analyzer.isAnagram(null, "text"));
    }
}
