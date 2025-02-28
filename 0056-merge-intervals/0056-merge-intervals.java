class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        Stack<int[]> stack = new Stack<>();
        int n = intervals.length;
        for(int i=0; i<n; i++){
            if(stack.size()==0) stack.push(intervals[i]);
            else{
                int temp = stack.peek()[1];
                if(temp < intervals[i][0]) stack.push(intervals[i]);
                else{
                    int first = stack.peek()[0];
                    stack.pop();
                    stack.push(new int[]{first, Math.max(temp, intervals[i][1])});
                }
            }
        }
        int m = stack.size();
        int[][] res = new int[m][2];
        int i=0;
        for(int[] a: stack){
            res[i++] = a;
        }
        return res;
    }
}