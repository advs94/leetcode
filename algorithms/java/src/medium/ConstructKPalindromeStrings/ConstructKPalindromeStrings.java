package medium;

public class ConstructKPalindromeStrings {
    /*
     * LC - 1400. Construct K Palindrome Strings
     */
    public boolean canConstruct(String s, int k) {
        // Step 1: Check if the length of the string is less than k
        if (s.length() < k) return false;
        int bitmask = 0;
        // Step 2: Calculate the bitmask for character frequencies
        for (char c : s.toCharArray()) {
            bitmask ^= (1 << (c - 'a')); // Toggle the bit for the character
        }
        // Step 3: Count the number of characters with odd frequencies
        int oddCount = Integer.bitCount(bitmask);
        // Step 4: Return true if odd character count is less than or equal to k
        return oddCount <= k;
    }
}
