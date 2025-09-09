// Last updated: 9/9/2025, 9:42:44 AM
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
    public static int max(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int lmax=Math.max(max(root.left),0);
        int rmax=Math.max(max(root.right),0);
        ans=Math.max(ans,lmax+rmax+root.val);
        return Math.max(lmax,rmax)+root.val;
    }
    static int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        ans=root.val;
        max(root);
        // int lmax=max(root.left);
        // int rmax=max(root.right);
        return ans;
    }
}