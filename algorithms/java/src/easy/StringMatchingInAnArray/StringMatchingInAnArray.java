package easy;

public class StringMatchingInAnArray {
    /*
     * LC - 1408. String Matching in an Array
     */
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (helper(word, words)) result.add(word); // Add word to result if it's a substring of another word
        }
        return result; // Return the list of matching words
    }

    private boolean helper(String s, String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > s.length()) {
                if (words[i].indexOf(s) != -1) return true; // Return true if s is a substring of words[i]
            }
        }
        return false; // Return false if no match is found
    }
}
