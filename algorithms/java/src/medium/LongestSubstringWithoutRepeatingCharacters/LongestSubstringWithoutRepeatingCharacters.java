package medium;

public class LongestSubstringWithoutRepeatingCharacters {
    /*
     * LC - 3. Longest Substring Without Repeating Characters
     */
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int j = 0;
        boolean[] arr = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (arr[c]) {
                arr[s.charAt(j++)] = false;
            }
            arr[c] = true;
            count = Math.max(count, i-j+1);
        }
        return count;
    }
}
