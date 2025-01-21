package easy;

public class LongestCommonPrefix {
    /*
     * LC - 14. Longest Common Prefix
     */
    public String longestCommonPrefix(String[] strs) {
        String lowest = strs[0]; // Initialize with the first string
        for (int i = 1; i < strs.length; i++) {
            if (lowest.length() > strs[i].length()) lowest = strs[i]; // Find the shortest string
        }
        for (int i = lowest.length(); i > 0; i--) {
            String sub = lowest.substring(0, i); // Get a substring of the shortest string
            int index = 0;
            for (String str : strs) {
                index = str.indexOf(sub); // Check if the substring is a prefix
                if (index != 0) break;
            }
            if (index == 0) return sub; // Return the longest common prefix
        }
        return ""; // Return empty string if no common prefix is found
    }
}
