class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<prerequisites.length; i++) adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        int[] inD = new int[numCourses];
        for(int i=0; i<numCourses; i++){
            for(int node: adj.get(i)) inD[node]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        int[] res = new int[numCourses];
        int index = 0;
        for(int i=0; i<numCourses; i++){
            if(inD[i]==0) queue.add(i);
        }
        while(!queue.isEmpty()){
            int node = queue.poll();
            res[index++] = node;
            for(int i: adj.get(node)){
                inD[i]--;
                if(inD[i]==0) queue.add(i);
            }
        }
        if(index<numCourses-1) return new int[]{};
        return res;
    }
}