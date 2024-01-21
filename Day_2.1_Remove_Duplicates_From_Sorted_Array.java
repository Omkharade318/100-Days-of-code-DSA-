class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int ii = 1; ii < nums.length; ii++){
            if(nums[ii] != nums[i]){
                nums[i+1] = nums[ii];
                i++;
            }
        }
        return i + 1;
    }
}
