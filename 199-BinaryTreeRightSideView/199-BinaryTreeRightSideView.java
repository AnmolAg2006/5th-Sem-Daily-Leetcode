// Last updated: 8/23/2025, 10:29:39 PM
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
    public static void func(TreeNode root,List<Integer>ll,int level)
    {
        if(root==null)
        {
            return;
        }
        if(level==ll.size())
        {
            ll.add(root.val);
        }
        func(root.right,  ll, level+1);
        func(root.left, ll ,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ll=new ArrayList<>();
        func(root,ll,0);
        return ll;
    }
}