package easy;

public class NumberOfCommonFactors {
    /*
     * LC - 2427. Number of Common Factors
     */
    public int commonFactors(int a, int b) {
        int freq = 0;
        int max = Math.max(a, b) / 2;
        for (int i = max; i > 0; i--) {
            if (a % i == 0 && b % i == 0) freq++; // Increment count if i is a common factor of a and b
        }
        return a == b ? freq + 1 : freq; // Add 1 to the count if a and b are equal
    }
}
