class Solution {
    public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        int ind = 0;
        int i =0;
        int j=0;
        while(i<hlen && j<nlen){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }else{
                i = ind+1;
                ind = i;
                j=0;
            }
        }
        return j==nlen?ind:-1;
    }
}