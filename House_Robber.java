class Solution {
    public int rob(int[] nums) {
        int rob   = 0;
        int norob = 0;
        for (int i = 0; i < nums.length; i++) {
            int newRob = nums[i] + norob;
            int newNoRob = Math.max(norob, rob);
            rob = newRob;
            norob = newNoRob;
        }
        return Math.max(norob,rob);
    }
}
