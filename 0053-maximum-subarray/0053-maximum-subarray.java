class Solution {
    public int maxSubArray(int[] nums) {
        int maxS = Integer.MIN_VALUE;
        int sum = 0;
        for(int n: nums){
            sum += n;
            if(sum > maxS) maxS=sum;
            if(sum <0) sum =0;
        }
        return maxS;
    }
}