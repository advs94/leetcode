package easy;

public class NumberOfUnequalTripletsInArray {
    /*
     * LC - 2475. Number of Unequal Triplets in Array
     */
    public int unequalTriplets(int[] nums) {
        final int n = nums.length, m = n - 1, l = m - 1;
        int count = 0;
        for(int i = 0; i < l; i++) {
            for(int j = i+1; j < m; j++) {
                if(nums[i] != nums[j]){
                    for(int k = j+1; k < n; k++) {
                        if(nums[i] != nums[k] && nums[j] != nums[k]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
