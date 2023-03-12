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
    TreeNode node = new TreeNode(0);
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return null;
        else if(root1 != null && root2 == null) return root1;
        else if(root1 == null && root2 != null) return root2;

        TreeNode sum = new TreeNode(root1.val + root2.val);
        sum.left = mergeTrees(root1.left, root2.left);
        sum.right = mergeTrees(root1.right, root2.right);
        return sum;
    }
}