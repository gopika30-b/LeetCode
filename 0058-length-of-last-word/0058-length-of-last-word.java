class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int res = 0;
        int i = str.length()-1;
        while(i>=0 && str.charAt(i)!=' '){
            res++;
            i--;
        }
        return res;
    }
}