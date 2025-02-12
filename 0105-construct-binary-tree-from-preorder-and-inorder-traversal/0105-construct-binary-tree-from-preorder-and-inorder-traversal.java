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
    private int preOrderIndex;
    private Map<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for(int i=0; i< inorder.length; i++) map.put(inorder[i],i);
        preOrderIndex = 0;
        return build(preorder, 0, inorder.length-1);
    }
    public TreeNode build(int[] preorder, int start, int end){
        if (start>end) return null;
        int rootVal = preorder[preOrderIndex++];
        TreeNode root = new TreeNode(rootVal);
        int mid = map.get(rootVal);
        root.left = build(preorder, start, mid-1);
        root.right = build(preorder, mid+1, end);
        return root;
    }
}