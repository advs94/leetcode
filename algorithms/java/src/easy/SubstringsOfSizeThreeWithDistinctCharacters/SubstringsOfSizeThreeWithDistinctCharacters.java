package easy;

public class SubstringsOfSizeThreeWithDistinctCharacters {
    /*
     * LC - 1876. Substrings of Size Three with Distinct Characters
     */
    public int countGoodSubstrings(String s) {
        final int n = s.length();
        int count = 0;
        char ch[] = s.toCharArray();
        for(int left = 0, mid = 1, right = 2; right < n; left++, mid++, right++){
            if(ch[left] != ch[right] && ch[mid] != ch[right] && ch[mid] != ch[left]) {
                count++;
            }
        }
        return count;
    }
}
