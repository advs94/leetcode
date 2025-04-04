package easy;

public class DiStringMatch {
    /*
     * LC - 942. DI String Match
     */
    public int[] diStringMatch(String s) {
        final int n = s.length();
        int max = n, min = 0;
        final int[] res = new int[max+1];
        for (int i = 0; i < n; i++) res[i] = s.charAt(i) == 'I' ? min++ : max--;
        res[n] = min;
        return res;
    }
}
