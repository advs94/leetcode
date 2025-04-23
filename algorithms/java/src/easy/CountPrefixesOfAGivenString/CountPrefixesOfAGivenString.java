package easy;

public class CountPrefixesOfAGivenString {
    /*
     * LC - 2255. Count Prefixes of a Given String
     */
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String word : words) {
            if (s.startsWith(word)) {
                count++;
            }
        }
        return count;
    }
}
