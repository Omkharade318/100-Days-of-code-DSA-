class Solution {
    public int countNodes(TreeNode root) {
        int ans=0;
        if(root==null)
            return 0;
        if(root.right!=null)
        {
            int rnodes=countNodes(root.right);
            ans+=rnodes;
        }
        if(root.left!=null)
        {
            int lnodes=countNodes(root.left);
            ans+=lnodes;
        }
        return ans+1;
    }
}
