package easy;

public class CountCommonWordsWithOneOccurrence {
    /*
     * LC - 2085. Count Common Words With One Occurrence
     */
    public int countWords(String[] words1, String[] words2) {
        final Map<String, Integer> map = new HashMap<>();
        for (String word1 : words1) map.put(word1, map.getOrDefault(word1, 0) + 1);
        int count = 0;
        for (String word2 : words2) {
            if (map.containsKey(word2)) {
                if (map.get(word2) == 1) {
                    map.put(word2, -1);
                    count++;
                } else if (map.get(word2) == -1) {
                    map.put(word2, 2);
                    count--;
                }
            } 
        }
        return count;
    }
}
