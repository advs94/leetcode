package easy;

public class CountTheNumberOfConsistentStrings {
    /*
     * LC - 1684. Count the Number of Consistent Strings
     */
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            int i = 0, n = word.length();
            char[] ch = word.toCharArray();
            for (; i < n; i++) {
                if (allowed.indexOf(ch[i]) == -1) {
                    break;
                }
            }
            if (i == n) {
                count++;
            }
        }
        return count;
    }
}
