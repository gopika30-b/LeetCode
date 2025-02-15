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
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return res;
    }
    public int maxPath(TreeNode root) {
        if(root == null) return 0;
        int lMP = Math.max(0,maxPath(root.left));
        int rMP = Math.max(0,maxPath(root.right));
        res = Math.max(res, root.val+lMP+rMP);
        return Math.max(lMP,rMP)+root.val;
    }
}