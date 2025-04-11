package easy;

public class CountPairsThatFormACompleteDayI {
    /*
     * LC - 3184. Count Pairs That Form a Complete Day I
     */
    public int countCompleteDayPairs(int[] hours) {
        final int[] freq = new int[24];
        int count = 0;
        for (int hour : hours) {
            int remainder = hour%24;
            count += freq[(24-remainder) % 24];
            freq[remainder]++;
        }
        return count;
    }
}
