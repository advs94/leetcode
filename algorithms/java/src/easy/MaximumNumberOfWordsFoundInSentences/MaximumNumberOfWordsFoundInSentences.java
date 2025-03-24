package easy;

public class MaximumNumberOfWordsFoundInSentences {
    /*
     * LC - 2114. Maximum Number of Words Found in Sentences
     */
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            int index = sentence.indexOf(' ', 0);
            int count = 1;
            while (index != -1) {
                count++;
                index = sentence.indexOf(' ', index+1);
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
