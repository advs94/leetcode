package easy;

public class FinalPricesWithASpecialDiscountInAShop {
    /*
     * LC - 1475. Final Prices With a Special Discount in a Shop
     */
    public int[] finalPrices(int[] prices) {
        final int n = prices.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
