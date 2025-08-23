// Last updated: 8/23/2025, 10:30:10 PM
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
    public static void preorder(TreeNode root,List<Integer>arr)
    {
        if(root==null)
        {
            return ;
        }
        preorder(root.left,arr);
        arr.add(root.val);

        preorder(root.right,arr);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>arr=new ArrayList<>();
        preorder(root,arr);
        return arr;
    }
}