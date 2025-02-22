package hard;

public class RecoverATreeFromPreorderTraversal {
    /*
     * LC - 1028. Recover a Tree From Preorder Traversal
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
    
    public TreeNode recoverFromPreorder(String traversal) {
        Pattern pattern = Pattern.compile("(-*)(\\d+)");
        Matcher matcher = pattern.matcher(traversal);
        matcher.find();
        TreeNode root = new TreeNode(Integer.parseInt(matcher.group(2)));
        dfs(root, matcher, 1);
        return root;
    }

    private static int[] dfs(TreeNode root, Matcher matcher, int rank) {
        while (matcher.find()) {
            int dashCount = matcher.group(1).length();
            int digits = Integer.parseInt(matcher.group(2));
            while (dashCount != 0) {
                if (rank == dashCount) {
                    if (root.left == null) root.left = new TreeNode(digits);
                    else if (root.right == null) root.right = new TreeNode(digits);
                    dashCount = 0;
                } else if (rank < dashCount) {
                    int[] node = null;
                    if (root.right == null) {
                        root.left.left = new TreeNode(digits);
                        node = dfs(root.left, matcher, dashCount);
                    }
                    else {
                        root.right.left = new TreeNode(digits);
                        node = dfs(root.right, matcher, dashCount);
                    }
                    if (node != null) {
                        dashCount = node[0];
                        digits = node[1];
                    } else {
                        dashCount = 0;
                    }
                } else {
                    return new int[]{dashCount, digits};
                }
            }
        }
        return null;
    }
}
