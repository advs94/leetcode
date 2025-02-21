package medium;

public class FindElementsInAContaminatedBinaryTree {
    /*
     * LC - 1261. Find Elements in a Contaminated Binary Tree
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class FindElements {

        Set<Integer> set = new HashSet<>();
        TreeNode tree;

        public FindElements(TreeNode root) {
            root.val = 0;
            set.add(0);
            dfs(root);
            tree = root;
        }

        public boolean find(int target) {
            return set.contains(target);
        }

        private void dfs (TreeNode root) {
            if (root.left != null) {
                int val = 2 * root.val + 1;
                root.left.val = val;
                set.add(val);
                dfs(root.left);
            }
            if (root.right != null) {
                int val = 2 * root.val + 2;
                root.right.val = val;
                set.add(val);
                dfs(root.right);
            }
        }
    }
}
