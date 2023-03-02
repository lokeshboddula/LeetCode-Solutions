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
    boolean validate(TreeNode node, long lower, long upper) {
		if(node == null) return true;
		if(node.val <= lower || node.val >= upper) return false;
		boolean isLeftBST = validate(node.left, lower, node.val);
		boolean isRightBST = validate(node.right, node.val, upper);
		return isLeftBST && isRightBST;
	}
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}