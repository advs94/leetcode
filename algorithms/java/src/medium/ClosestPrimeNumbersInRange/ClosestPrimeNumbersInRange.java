package medium;

public class ClosestPrimeNumbersInRange {
    /*
     * LC - 2523. Closest Prime Numbers in Range
     */
    public int[] closestPrimes(int left, int right) {
        boolean[] isPrime = new boolean[right+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int prevPrime = -1;
        int[] closestPrimes = {-1,-1};
        int smallest = Integer.MAX_VALUE;
        for (int i = left; i <= right; i++) {
            if (i < 2) continue;
            if (isPrime[i]) {
                if (prevPrime != -1) {
                    int sub = i - prevPrime;
                    if (sub == 1) {
                        closestPrimes[0] = prevPrime;
                        closestPrimes[1] = i;
                        return closestPrimes;
                    }
                    if (sub < smallest) {
                        smallest = sub;
                        closestPrimes[0] = prevPrime;
                        closestPrimes[1] = i;
                    }
                }
                prevPrime = i;
            }
        }
        return closestPrimes;
    }
}
