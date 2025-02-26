class Solution {
    public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        if(hlen < nlen ) return -1;
        for(int i=0; i<= hlen-nlen; i++){
            if(haystack.substring(i,i+nlen).equals(needle)) return i;
        }
        return -1;
    }
}