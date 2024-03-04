class Solution {
    List<Double> ans=new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            double count=q.size();
            double sum=0;
            for(int i=0;i<count;i++){
                TreeNode x=q.remove();
                sum+=x.val;
                if(x.left!=null){
                    q.add(x.left);
                }
                if(x.right!=null){
                    q.add(x.right);
                }
            }
            ans.add(sum/count);
        }
        return ans;

    }
}
