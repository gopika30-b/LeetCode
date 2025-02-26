class Solution {
    public String longestCommonPrefix(String[] strs) {
        int res = strs[0].length();
        String str1 = strs[0];
        for(int k=1; k<strs.length; k++){
            String str2 = strs[k];
            int i=0;
            int n = Math.min(str1.length(), str2.length());
            int count =0;
            while(i<n ){
                if(str1.charAt(i)== str2.charAt(i)){
                    count++;
                    i++;
                }else{
                    break;
                }
            }
            res = Math.min(res, count);
        }
        return strs[0].substring(0,res);
    }
}