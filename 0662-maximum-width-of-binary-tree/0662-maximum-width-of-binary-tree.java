/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Pair{
    TreeNode node;
    int id;
    public Pair(TreeNode node, int id){
        this.node = node;
        this.id = id;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int res = 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root,0));
        while(!queue.isEmpty()){
            int n = queue.size();
            int min = queue.peek().id;
            int first = 0;
            int last = 0;
            for(int i=0; i<n; i++){
                TreeNode node = queue.peek().node;
                int id = queue.peek().id - min;
                queue.poll();
                if(i==0) first = id;
                if(i==n-1) last = id;
                if(node.left != null) queue.add(new Pair(node.left, 2*id+1));
                if(node.right != null) queue.add(new Pair(node.right, 2*id+2));
            }
            res = Math.max(res, last-first+1);
        }
        return res;
    }
}