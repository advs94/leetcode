package easy;

public class FindFirstPalindromicStringInTheArray {
    /*
     * LC - 2108. Find First Palindromic String in the Array
     */
    public String firstPalindrome(String[] words) {
        for (String word : words) if (isPalindrome(word)) return word;
        return "";
    }

    private boolean isPalindrome(String word) {
        final int n = word.length();
        for (int i = 0; i < n; i++) if (word.charAt(i) != word.charAt(n-i-1)) return false;
        return true;
    }
}
