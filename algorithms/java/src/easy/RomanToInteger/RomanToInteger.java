package easy;

public class RomanToInteger {
    /*
     * LC - 13. Roman to Integer
     */
    public int romanToInt(String s) {
        int result = 0;
        int previous = 0;
        int current = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I': current = 1; break; // Roman numeral I
                case 'V': current = 5; break; // Roman numeral V
                case 'X': current = 10; break; // Roman numeral X
                case 'L': current = 50; break; // Roman numeral L
                case 'C': current = 100; break; // Roman numeral C
                case 'D': current = 500; break; // Roman numeral D
                case 'M': current = 1000; break; // Roman numeral M
                default: throw new IllegalArgumentException("Invalid Roman numeral"); // Invalid case
            }
            if (current < previous) result -= current; // Subtract if the current numeral is smaller
            else result += current; // Otherwise, add it
            previous = current; // Update the previous value for next iteration
        }
        return result; // Return the final result
    }
}
