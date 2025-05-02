package easy;

public class CountPairsOfSimilarStrings {
    /*
     * LC - 2506. Count Pairs Of Similar Strings
     */
    public int similarPairs(String[] words) {
        final int n = words.length;
        final boolean[][] freq = new boolean[n][26];
        for (int i = 0; i < n; i++) {
            for (char ch : words[i].toCharArray()) {
                freq[i][ch - 'a'] = true;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int k = 0;
                for (k = 0; k < 26; k++) {
                    if (freq[i][k] != freq[j][k]) {
                        break;
                    }
                }
                if (k == 26) {
                    count++;
                }
            }
        }
        return count;
    }
}
