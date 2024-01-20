class Solution {
    public int removeElement(int[] nums, int val) {
          int zero = 0;
          for(int i = 0; i<nums.length; i++){
              if(val != nums[i]){
                  nums[zero] = nums[i];
                   zero++; 
              }
          }
          return zero;
    }
}
