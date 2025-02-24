class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -1;
        while(left<right){
            int tot = numbers[left]+numbers[right];
            if(tot<target) left++;
            else if(tot>target) right--;
            else{
                return new int[] {left+1, right+1};
            }
        }
        return new int[]{};
    }
}