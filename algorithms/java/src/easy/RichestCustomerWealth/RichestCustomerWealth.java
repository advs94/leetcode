package easy;

public class RichestCustomerWealth {
    /*
     * LC - 1672. Richest Customer Wealth
     */
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] customer : accounts) {
            int wealth = 0;
            for (int bank : customer) {
                wealth += bank;
            }
            max = Math.max(max, wealth);
        }
        return max;
    }
}
