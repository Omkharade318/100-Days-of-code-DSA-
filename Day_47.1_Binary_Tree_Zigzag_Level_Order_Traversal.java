class Solution {
   
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();

        if(root==null)return res;
        Stack<TreeNode> LtoR= new Stack<>();
        Stack<TreeNode> RtoL =new Stack<>();
        LtoR.push(root);

        boolean lefttorigh=false;

        while(!LtoR.isEmpty()||!RtoL.isEmpty())
        {
            List<Integer> temp = new ArrayList<>();
            if(lefttorigh)
            {
                while(!RtoL.isEmpty())
                {
                    TreeNode node= RtoL.pop();
                    temp.add(node.val);
                    if(node.left!=null)
                    {
                        LtoR.push(node.left);
                    }
                    if(node.right!=null)
                    {
                        LtoR.push(node.right);
                    }
                }
                Collections.reverse(temp);

                res.add(temp);

                lefttorigh = false;
            }
            else
            {
                while(!LtoR.isEmpty()){
                    TreeNode node = LtoR.pop();
                    temp.add(node.val);
                    if(node.right!=null)
                    {
                        RtoL.push(node.right);
                    }
                    if(node.left!=null)
                    {
                        RtoL.push(node.left);

                    }
                }
                Collections.reverse(temp);

                res.add(temp);
                lefttorigh= true;

            }



        }

        return res;


    }

}
