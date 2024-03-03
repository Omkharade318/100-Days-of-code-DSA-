class Solution {

    public TreeNode node;

    public boolean check(TreeNode root, TreeNode p){
        if(root==null || p == null){
            return false;
        }
        if(root.val == p.val){
            return true;
        }

        return check(root.left, p) || check(root.right, p);
    }

    public boolean search(TreeNode root, TreeNode p, TreeNode q){
        if(root==null){
            return false;
        }

        if(root.val == p.val){
            if(check(p ,q)){
                node = p;
                return false;
            }
            return true;
        }

        if(search(root.left, p, q)){
            if(check(root.right, q)){
                node = root;
            }
            return true;
        }
        if(search(root.right, p, q)){
            if(check(root.left, q)){
                node = root;
            }
            return true;
        }

        return false;

        

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        search(root, p, q);
        if(node==null){
            search(root, q, p);
        }

        return node;
    }
}
