package easy;

public class MinimumCostToMoveChipsToTheSamePosition {
    /*
     * LC - 1217. Minimum Cost to Move Chips to The Same Positions
     */
    public int minCostToMoveChips(int[] position) {
        final int[] arr = new int[2];
        for (int pos : position) arr[pos & 1]++;
        final int end = arr[0] > arr[1] ? 0 : 1;
        int count = 0;
        for (int pos : position) count += (pos & 1) == end ? 0 : 1;
        return count;
    }
}
