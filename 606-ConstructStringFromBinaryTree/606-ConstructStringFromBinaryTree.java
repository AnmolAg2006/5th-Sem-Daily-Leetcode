// Last updated: 8/23/2025, 10:28:18 PM
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
    public static void print(TreeNode root,StringBuilder str)
    {
        if(root==null)
        {
            return ;
        }   
        str.append(root.val);
        if(root.left==null && root.right==null)
        {
            return;
        }
            str.append("(");
            print(root.left,str);
            str.append(")");
        
        if(root.right!=null)
        {
            str.append("(");
            print(root.right,str);
            str.append(")");
        }
        
    }
    public String tree2str(TreeNode root) {
        StringBuilder str=new StringBuilder();
        print(root,str);
        return str.toString();
    }
}