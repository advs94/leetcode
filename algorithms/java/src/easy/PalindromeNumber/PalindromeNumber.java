package easy;

public class PalindromeNumber {
    /*
     * LC - 9. Palindrome Number
     */
    public boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;
        while (x > 0) {
            reverse *= 10; // Shift the digits of reverse left by one position
            reverse += x % 10; // Add the last digit of x to reverse
            x /= 10; // Remove the last digit from x
        }
        return reverse == original; // Check if the reversed number matches the original
    }
}
