class Solution {
    int res = -1;
    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);

        return res;
    }

    public int helper(TreeNode root, int k){
        if(root == null) return 0;

        int left = 1 + helper(root.left, k);

        if(left == k){
            res = root.val;
        }

        return left + helper(root.right, k - left);
    }
}
