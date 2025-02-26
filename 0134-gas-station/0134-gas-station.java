class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totG = 0;
        int totC = 0;
        for(int i=0; i<gas.length; i++){
            totG += gas[i];
            totC += cost[i];
        }
        if(totC > totG) return -1;
        int start = 0;
        int remG = 0;
        for(int i=0; i<gas.length; i++){
            remG += gas[i] - cost[i];
            if(remG < 0){
                start = i+1;
                remG = 0;
            }
        }
        return start;
    }
}