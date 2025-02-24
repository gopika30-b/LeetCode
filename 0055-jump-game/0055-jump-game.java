class Solution {
    public boolean canJump(int[] nums) {
        int target = nums.length-1;
        for(int i= nums.length-1; i>=0; i--){
            if(nums[i]>=target-i) target = i;
        }
        return target==0;
    }
}