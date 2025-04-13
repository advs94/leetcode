package easy;

public class TakeGiftsFromTheRichestPile {
    /*
     * LC - 2558. Take Gifts From the Richest Pile
     */
    public long pickGifts(int[] gifts, int k) {
        final PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        long sum = 0;
        for (int num : gifts) {
            pq.offer(num);
            sum += num;
        }
        for (int i = 0; i < k; i++) {
            int max = pq.poll(), sqrt = (int) Math.sqrt(max);
            sum -= max - sqrt;
            pq.offer(sqrt);
        }
        return sum;
    }
}
