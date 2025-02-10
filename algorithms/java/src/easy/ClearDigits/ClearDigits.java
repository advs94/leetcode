package easy;

public class ClearDigits {
    /*
     * LC - 3174. Clear Digits
     */
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        int index = 0;
        while (index < sb.length()) {
            int ch = (int) sb.charAt(index);
            if (ch > 47 && ch < 58) {
                sb.delete(index-1, index-- +1);
            } else {
                index++;
            }
        }
        return sb.toString();
    }
}
