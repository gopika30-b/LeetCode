class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majority = 0;
        int res = 0;
        for(int n: nums){
            map.put(n, 1+map.getOrDefault(n,0));
            if(map.get(n)>majority){
                majority = map.get(n);
                res = n;
            }
        }
        return res;
    }
}