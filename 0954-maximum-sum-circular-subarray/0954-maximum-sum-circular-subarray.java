class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int tot =0;
        int currMax=0;
        int currMin =0;
        int max = nums[0];
        int min = nums[0];
        for(int n: nums){
            tot += n;
            currMax = Math.max(n, currMax+n);
            currMin = Math.min(n, currMin+n);
            max = Math.max(max, currMax);
            min = Math.min(min, currMin);
        }
        return max<0?max:Math.max(max, tot-min);
    }
}