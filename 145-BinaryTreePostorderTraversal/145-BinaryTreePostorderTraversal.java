// Last updated: 8/23/2025, 10:29:51 PM
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
    public static void inorders(TreeNode root,List<Integer>arr)
    {
        if(root==null)
        {
            return ;
        }
        inorders(root.left,arr);

        inorders(root.right,arr);
        arr.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>arr=new ArrayList<>();
        inorders(root,arr);
        return arr;
    }
}