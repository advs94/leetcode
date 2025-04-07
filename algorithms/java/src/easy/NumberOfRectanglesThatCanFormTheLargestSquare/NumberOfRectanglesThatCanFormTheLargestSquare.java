package easy;

public class NumberOfRectanglesThatCanFormTheLargestSquare {
    /*
     * LC - 1725. Number Of Rectangles That Can Form The Largest Square
     */
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0, count = 0;
        for (int[] rectangle : rectangles) {
            int maxSquare = Math.min(rectangle[0], rectangle[1]);
            if (maxLen == maxSquare) {
                count++;
            } else if (maxLen < maxSquare) {
                maxLen = maxSquare;
                count = 1;
            }
        }
        return count;
    }
}
