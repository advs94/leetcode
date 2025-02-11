package medium;

public class RemoveAllOccurrencesOfASubstring {
    /*
     * LC - 1910. Remove All Occurrences of a Substring
     */
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int index = sb.indexOf(part, 0);
        while (index > -1) {
            sb.delete(index, index + part.length());
            index = sb.indexOf(part, 0);
        }
        return sb.toString();
    }
}
