package easy;

public class CountSubstringsThatSatisfyK-constraintI {
    /*
     * LC - 3258. Count Substrings That Satisfy K-Constraint I
     */
    public int countKConstraintSubstrings(String s, int k) {
        final int n = s.length();
        final int[] freq = new int[2];
        int count = 0;
        for (int i = 0, j = 0; j < n; j++) {
            freq[s.charAt(j)-'0']++;
            while (i <= j && freq[0] > k && freq[1] > k) {
                freq[s.charAt(i++)-'0']--;
            }
            count += j - i + 1;
        }
        return count;
    }
}
