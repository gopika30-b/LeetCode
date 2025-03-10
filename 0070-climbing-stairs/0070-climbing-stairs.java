class Solution {
    public int climbStairs(int n) {
        if(n<=3) return n;
        int first = 2;
        int second = 3;
        int temp = 0;
        for(int i= 4; i<=n; i++){
            temp = first+second;
            first = second;
            second = temp;
        }
        return temp;
    }
}