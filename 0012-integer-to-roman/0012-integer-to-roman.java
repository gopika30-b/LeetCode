class Solution {
    public String intToRoman(int num) {
        if(num==0) return null;
        int[] val = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder res = new StringBuilder();
        for(int i= 12; i>=0; i--){
            while(num >= val[i]){
                res.append(roman[i]);
                num -= val[i];
            }
        }
        return res.toString();
    }
}