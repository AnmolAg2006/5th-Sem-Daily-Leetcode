// Last updated: 8/23/2025, 10:30:03 PM
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
    public static int height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        boolean self=Math.abs(height(root.left)-height(root.right))<=1;
        return self && isBalanced(root.left) && isBalanced(root.right);
    }
}