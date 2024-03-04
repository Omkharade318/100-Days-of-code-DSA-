class Solution {
    public List<Integer> FindCurrentLevel(TreeNode root , int level) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        if (level == 1) {
            list.add(root.val);
        } else if (level > 1) {
            list.addAll(FindCurrentLevel(root.left, level - 1));
            list.addAll(FindCurrentLevel(root.right, level - 1));
        }
        return list;
    }

    public List<Integer> LevelOrder(TreeNode root) {
        List<Integer> liss = new ArrayList<>();
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            List<Integer> lis = FindCurrentLevel(root, i);
            if (!lis.isEmpty()) {
                int ans = lis.get(lis.size() - 1);
                liss.add(ans);
            }
        }
        return liss;
    }

    public int height(TreeNode root) {
        if (root == null)
            return 0;
        else {
            int lheight = height(root.left);
            int rheight = height(root.right);
            if (lheight > rheight)
                return lheight + 1;
            else
                return rheight + 1;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        return LevelOrder(root);
    }
}
