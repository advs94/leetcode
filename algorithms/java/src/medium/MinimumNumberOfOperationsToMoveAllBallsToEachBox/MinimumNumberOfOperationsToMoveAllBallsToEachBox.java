package medium;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    /*
     * LC - 1769. Minimum Number of Operations to Move All Balls to Each Box
     */
    public int[] minOperations(String boxes) {
        final int n = boxes.length();
        final byte[] b = boxes.getBytes();
        final int[] res = new int[n];
        int sum = 0, count = 0;
        for(int i = n - 1; i >= 0; i--) sum += count += b[i] & 1;
        for(int i = 0; i < n; i++){
            res[i] = sum -= count;
            count -= (b[i] & 1) << 1;
        }
        return res;
    }
}
