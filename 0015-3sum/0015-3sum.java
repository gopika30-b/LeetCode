class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length<3) return res;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int tot = nums[i]+nums[j]+nums[k];
                if(tot<0) j++;
                else if(tot>0) k--;
                else{
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while(j<k && nums[j]==nums[j-1]) j++;
                }
            }
        }
        return res;
    }
}