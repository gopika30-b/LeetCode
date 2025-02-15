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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        cal(root, 0);
        return sum;
    }
    public void cal(TreeNode node, int curr){
        if(node.left == null && node.right == null){
            sum += (curr*10)+node.val;
            return;
        }
        if(node.left != null) cal(node.left, (curr*10)+node.val);
        if(node.right != null) cal(node.right, (curr*10)+node.val);
    }
}