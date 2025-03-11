package medium;

public class NumberOfSubstringsContainingAllThreeCharacters {
    /*
     * LC - 1358. Number of Substrings Containing All Three Characters
     */
    public int numberOfSubstrings(String s) {
        final int n = s.length();
        final int[] freq = new int[3];
        int num = 0;
        freq[s.charAt(0)-'a']++;
        for (int i = 0, j = 1; j <= n;) {
            if (freq[0] != 0 && freq[1] != 0 && freq[2] != 0) {
                num += n - j + 1;
                freq[s.charAt(i++)-'a']--;
            } else if (j != n) {
                freq[s.charAt(j++)-'a']++;
            } else {
                j++;
            }
        }
        return num;
    }
}
