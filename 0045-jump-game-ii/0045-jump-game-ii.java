class Solution {
    public int jump(int[] nums) {
        int near = 0;
        int far = 0;
        int jump = 0;
        while(far < nums.length-1){
            int farest = 0;
            for(int i=near; i<=far; i++) farest = Math.max(farest, i+nums[i]);
            near = far+1;
            far = farest;
            jump++;
        }
        return jump;
    }
}