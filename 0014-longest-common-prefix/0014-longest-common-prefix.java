class Solution {
    public String longestCommonPrefix(String[] strs) {
        int res = strs[0].length();
        for(int k=1; k<strs.length; k++){
            String str1 = strs[k-1];
            String str2 = strs[k];
            int i=0;
            int j=0;
            int n = Math.min(str1.length(), str2.length());
            int count =0;
            while(i<n && j<n){
                if(str1.charAt(i)== str2.charAt(j)){
                    count++;
                    i++;
                    j++;
                }else{
                    break;
                }
            }
            res = Math.min(res, count);
        }
        return strs[0].substring(0,res);
    }
}