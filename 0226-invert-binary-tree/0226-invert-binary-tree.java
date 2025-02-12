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
    public TreeNode invertTree(TreeNode root) {
        isMirror(root);
        return root;
    }
    public void isMirror(TreeNode node){
        if(node==null) return;
        isMirror(node.left);
        isMirror(node.right);
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}