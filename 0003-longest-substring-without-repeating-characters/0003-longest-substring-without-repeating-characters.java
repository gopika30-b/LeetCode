class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 1;
        int n = s.length();
        if(n==0) return 0;
        int i =0;
        while(i<n){
            int j = i+1;
            HashSet<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            while(j<n && !set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }
            len = Math.max(len, set.size());
            i++;
        }
        return len;
    }
}