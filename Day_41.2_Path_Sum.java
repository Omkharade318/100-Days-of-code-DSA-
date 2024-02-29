 class Solution {
        public static boolean hasPathSum(TreeNode root, int k) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return root.val == k;
        return hasPathSum(root.left, k - root.val) || hasPathSum(root.right, k - root.val);
    }
}
