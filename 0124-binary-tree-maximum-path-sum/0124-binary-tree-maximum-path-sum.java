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
    public int maxPathSum(TreeNode root) {
        int[] res = new int[1];
        res[0] = Integer.MIN_VALUE;
        maxPath(root, res);
        return res[0];
    }
    public int maxPath(TreeNode root, int[] res) {
        if(root == null) return 0;
        int lMP = Math.max(0,maxPath(root.left, res));
        int rMP = Math.max(0,maxPath(root.right, res));
        res[0] = Math.max(res[0], root.val+lMP+rMP);
        return Math.max(lMP,rMP)+root.val;
    }
}