package easy;

public class MaximumUnitsOnATruck {
    /*
     * LC - 1710. Maximum Units on a Truck
     */
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        final int[] freq = new int[1001];
        for (int[] arr : boxTypes) freq[arr[1]] += arr[0];
        int units = 0;
        for (int i = 1000; i > 0; i--) {
            if (freq[i] != 0) {
                int boxes = Math.min(freq[i], truckSize);
                units += boxes * i;
                truckSize -= boxes;
                if (truckSize == 0) return units;
            }
        }
        return units;
    }
}
