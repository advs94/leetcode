package medium;

public class WordSubsets {
    /*
     * LC - 916. Word Subsets
     */
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] count = new int[26];
        for (String b : B) {
            int[] tmp = new int[26];
            for (char c : b.toCharArray()) tmp[c - 'a']++; // Count frequency of each character in B
            for (int i = 0; i < 26; ++i)
                count[i] = Math.max(count[i], tmp[i]); // Keep the maximum frequency for each character in B
        }
        List<String> res = new ArrayList<>();
        for (String a : A) {
            int[] tmp = new int[26];
            for (char c : a.toCharArray()) tmp[c - 'a']++; // Count frequency of each character in A
            boolean isValid = true;
            for (int i = 0; i < 26; ++i) {
                if (tmp[i] < count[i]) { // Check if A has enough characters to satisfy B
                    isValid = false;
                    break;
                }
            }
            if (isValid) res.add(a); // Add valid word to result list
        }
        return res; // Return the list of valid words
    }
}
