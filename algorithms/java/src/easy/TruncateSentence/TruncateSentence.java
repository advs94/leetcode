package easy;

public class TruncateSentence {
    /*
     * LC - 1816. Truncate Sentence
     */
    public String truncateSentence(String s, int k) {
        int index = -1;
        for (int i = 0; i < k; i++) index = s.indexOf(' ', index+1);
        return index == -1 ? s : s.substring(0, index);
    }
}
