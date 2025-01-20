package easy;

public class CountingWordsWithAGivenPrefix {
    /*
     * LC - 2185. Counting Words With a Given Prefix
     */
    public int prefixCount(String[] words, String pref) {
        int prefixCount = 0;
        for (String word : words) {
            if (word.startsWith(pref)) prefixCount++; // Increment count if word starts with the prefix
        }
        return prefixCount; // Return the total count of words with the given prefix
    }
}
