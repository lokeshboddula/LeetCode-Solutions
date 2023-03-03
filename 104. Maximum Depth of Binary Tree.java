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
    int helper(TreeNode root, int depth) {
        if(root == null) return 0;
        int left = helper(root.left, depth);
        int right = helper(root.right, depth);

        return Math.max(left, right) + 1;
    }
    public int maxDepth(TreeNode root) {
        return helper(root, 0);
    }
}