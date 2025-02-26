class Solution {
    public String convert(String s, int numRows) {
        if(s.length()<numRows || numRows == 1) return s;
        ArrayList<Character>[] lst = new ArrayList[numRows];
        for(int i=0; i<numRows; i++) lst[i] = new ArrayList<>();
        int ind = 0;
        int dir = 1;
        for(int i=0; i<s.length(); i++){
            lst[ind].add(s.charAt(i));
            if(ind==0) dir=1;
            else if(ind == numRows-1) dir=-1;
            ind += dir;
        }
        StringBuilder res = new StringBuilder();
        for(int i=0; i<numRows; i++){
            for(char val: lst[i]) res.append(val);
        }
        return res.toString();
    }
}