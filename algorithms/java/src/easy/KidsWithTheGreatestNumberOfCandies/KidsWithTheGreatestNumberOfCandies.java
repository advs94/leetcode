package easy;

public class KidsWithTheGreatestNumberOfCandies {
    /*
     * LC - 1431. Kids With the Greatest Number of Candies
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        final int n = candies.length;
        int max = candies[0];
        for (int i = 1; i < n; i++) max = Math.max(max, candies[i]);
        final List<Boolean> greatest = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= max) greatest.add(true);
            else greatest.add(false);
        }
        return greatest;
    }
}
