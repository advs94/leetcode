package easy;

public class FindIndicesOfStableMountains {
    /*
     * LC - 3285. Find Indices of Stable Mountains
     */
    public List<Integer> stableMountains(int[] height, int threshold) {
        final int n = height.length;
        final List<Integer> stableMountains = new ArrayList<>();
        for (int i = 1; i < n; i++) if (height[i-1] > threshold) stableMountains.add(i);
        return stableMountains;
    }

    /*
     * LC - 3289. The Two Sneaky Numbers of Digitville
     */
public int[] getSneakyNumbers(int[] nums) {
        final int[] snum = new int[2];
        final int[] freq = new int[nums.length-2];
        int index = 0;
        for (int num : nums) {
            if (++freq[num] == 2) {
                snum[index++] = num;
            }
        }
        return snum;
    }
}
