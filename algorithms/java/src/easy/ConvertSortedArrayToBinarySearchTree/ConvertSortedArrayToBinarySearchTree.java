package easy;

public class ConvertSortedArrayToBinarySearchTree {
    /*
     * LC - 108. Convert Sorted Array to Binary Search Tree
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return sort(nums, 0, nums.length - 1);
    }

    private TreeNode sort (int[] nums, int low, int high) {
        if (low > high) return null;
        final int mid = (low + high) / 2;
        final TreeNode node = new TreeNode(nums[mid]);
        node.left = sort(nums, low, mid - 1);
        node.right = sort(nums, mid + 1, high);
        return node;
    }
}
