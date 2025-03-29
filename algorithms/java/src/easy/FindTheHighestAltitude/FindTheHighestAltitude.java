package easy;

public class FindTheHighestAltitude {
    /*
     * LC - 1732. Find the Highest Altitude
     */
    public int largestAltitude(int[] gain) {
        int max = 0, altitude = 0;
        for (int netGain : gain) {
            altitude += netGain;
            max = Math.max(max, altitude);
        }
        return max;
    }
}
