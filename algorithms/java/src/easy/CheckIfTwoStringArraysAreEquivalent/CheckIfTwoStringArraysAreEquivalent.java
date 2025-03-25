package easy;

public class CheckIfTwoStringArraysAreEquivalent {
    /*
     * LC - 1662. Check If Two String Arrays are Equivalent
     */
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder(word1[0]), sb2 = new StringBuilder(word2[0]);
        for (int i = 1; i < word1.length; i++) sb1.append(word1[i]);
        for (int i = 1; i < word2.length; i++) sb2.append(word2[i]);
        return sb1.toString().equals(sb2.toString());
    }
}
