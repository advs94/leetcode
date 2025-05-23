package easy;

public class CountTestedDevicesAfterTestOperations {
    /*
     * LC - 2960. Count Tested Devices After Test Operations
     */
    public int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] - count > 0) {
                count++;
            }
        }
        return count;
    }
}
