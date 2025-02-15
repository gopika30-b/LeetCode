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
class Solution {
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        int res = Integer.MAX_VALUE;
        for(int i=0; i<arr.size()-1; i++){
            res = Math.min(res, Math.abs(arr.get(i) - arr.get(i+1)));
        }
        return res;
    }
    public void inorder(TreeNode node, ArrayList<Integer> arr){
        if(node == null) return;
        inorder(node.left, arr);
        arr.add(node.val);
        inorder(node.right, arr);
    }
}