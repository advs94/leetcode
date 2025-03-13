package medium;

public class ZeroArrayTransformationIi {
    /*
     * LC - 3356. Zero Array Transformation II
     */
    public int minZeroArray(int[] nums, int[][] queries) {
        final int n = nums.length;
        final int[] diff = new int[n+1];
        int k = 0;
        for (int i = 0, sum = 0; i < n; i++) {
            while (sum + diff[i] < nums[i]) {  
                if (++k > queries.length) return -1;
                int left = queries[k-1][0];  
                int right = queries[k-1][1];  
                int val =  queries[k-1][2];  
                if (right >= i) {  
                    diff[Math.max(left, i)] += val;
                    diff[right+1] -= val;
                }
            }
            sum += diff[i];  
        }
        return k;
    }
}
