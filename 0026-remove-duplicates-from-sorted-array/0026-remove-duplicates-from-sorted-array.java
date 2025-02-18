class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                nums[k++] = nums[i];
                count++;
            }
        }
        return count;
    }
}