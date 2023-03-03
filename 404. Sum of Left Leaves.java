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
    int sumOfLeaves (TreeNode root, boolean flag) {
        if(root == null) return 0;
        int left = sumOfLeaves(root.left, true);
        int right = sumOfLeaves(root.right, false);
        if(root.left == null && root.right == null && flag) {
            return left + right + root.val;
        }
        return left + right;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeaves(root, false);
    }
}