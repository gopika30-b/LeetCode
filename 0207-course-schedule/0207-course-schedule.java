class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length==0) return true;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<prerequisites.length; i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int[] inD = new int[numCourses];
        for(int i=0; i<numCourses; i++){
            for(int node: adj.get(i)){
                inD[node]++;
            }
        }
        List<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(inD[i]==0) queue.add(i);
        }
        while(!queue.isEmpty()){
            int node = queue.poll();
            res.add(node);
            for(int i: adj.get(node)){
                inD[i]--;
                if(inD[i]==0) queue.add(i);
            }
        }
        return res.size()==numCourses;
    }
}