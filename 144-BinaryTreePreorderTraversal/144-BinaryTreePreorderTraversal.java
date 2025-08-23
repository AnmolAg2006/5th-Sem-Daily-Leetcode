// Last updated: 8/23/2025, 10:29:52 PM
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
        arr.add(root.val);
        inorders(root.left,arr);

        inorders(root.right,arr);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>arr=new ArrayList<>();
        inorders(root,arr);
        return arr;
    }
}