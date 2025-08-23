// Last updated: 8/23/2025, 10:28:30 PM
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
    static class Info{
        int ht;
        int diam;
        public Info(int diam,int ht)
        {
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter(TreeNode root)
    {
        if(root==null)
        {
            return new Info(0,0);
        }
        Info lInfo=diameter(root.left);
        Info rInfo=diameter(root.right);
        int height=Math.max(lInfo.ht,rInfo.ht)+1;
        return new Info(Math.max(Math.max(lInfo.diam,rInfo.diam),lInfo.ht+rInfo.ht+1),height);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        return diameter(root).diam-1;
    }
}