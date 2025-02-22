class Solution {
    public int majorityElement(int[] nums) {
        int key = 0;
        int count = 0;
        for(int n: nums){
            if(count==0) key=n;
            count += (key==n) ? 1: -1;
        }
        return key;
    }
}