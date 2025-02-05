package easy;

public class CheckIfOneStringSwapCanMakeStringsEqual {
    /*
     * LC - 1790. Check if One String Swap Can Make Strings Equal
     */
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1.equals(s2)) return true;
        int firstIndex = -1;
        int lastIndex = -1;
        for (int i = 0; i < s2.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (lastIndex != -1) {
                    return false;
                }
                if (firstIndex == -1) {
                    firstIndex = i;
                } else if (lastIndex == -1) {
                    lastIndex = i;
                }
            }
        }
        return firstIndex != -1 && lastIndex != -1 && s1.charAt(firstIndex) == s2.charAt(lastIndex) && s1.charAt(lastIndex) == s2.charAt(firstIndex);
    }
}
