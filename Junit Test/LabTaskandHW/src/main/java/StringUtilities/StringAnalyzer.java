package StringUtilities;
import java.util.Arrays;

public class StringAnalyzer {

    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) return false;
        String clean = s.replaceAll("[^A-Za-z]", "").toLowerCase();
        return new StringBuilder(clean).reverse().toString().equals(clean);
    }

    public int countVowels(String s) {
        if (s == null) return 0;
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }

    public boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        char[] a = s1.replaceAll("[^A-Za-z]", "").toLowerCase().toCharArray();
        char[] b = s2.replaceAll("[^A-Za-z]", "").toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
