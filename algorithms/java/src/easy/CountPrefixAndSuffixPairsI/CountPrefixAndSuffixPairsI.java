package easy;

public class CountPrefixAndSuffixPairsI {
    /*
     * LC - 3042. Count Prefix and Suffix Pairs I
     */
    public int countPrefixSuffixPairs(String[] words) {
        int prefixSuffixPairsCount = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) prefixSuffixPairsCount++; // Increment count if pair matches
            }
        }
        return prefixSuffixPairsCount; // Return total count of prefix-suffix pairs
    }

    public boolean isPrefixAndSuffix(String str1, String str2) {
        return str2.startsWith(str1) && str2.endsWith(str1); // Check if str1 is both prefix and suffix of str2
    }
}
