package easy;

public class MaximumValueOfAStringInAnArray {
    /*
     * LC - 2496. Maximum Value of a String in an Array
     */
    public int maximumValue(String[] strs) {
        int max = 0;
        for (String str : strs) max = Math.max(max, hasLetters(str) ? str.length() : Integer.parseInt(str));
        return max;
    }

    private boolean hasLetters(String str) {
        for (char ch : str.toCharArray()) {
            if (ch < 48 || ch > 57) {
                return true;
            }
        }
        return false;
    }
}
