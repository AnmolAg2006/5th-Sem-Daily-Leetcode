// Last updated: 8/23/2025, 10:30:09 PM
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
        {
            return true;

        }
        if(p==null || q==null)
        {
            return false;
        }
        if(p.val!=q.val)
        {
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}