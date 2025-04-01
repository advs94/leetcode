package easy;

public class FindMaximumNumberOfStringPairs {
    /*
     * LC - 2744. Find Maximum Number of String Pairs
     */
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        final int n = words.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)) {
                    count++;
                }
            }
        }
        return count;
    }
}
