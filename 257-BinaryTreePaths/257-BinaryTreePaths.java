// Last updated: 8/23/2025, 10:29:23 PM
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
    public static void print(TreeNode root,String str,List<String>ans)
    {
        if (root.left == null && root.right == null) ans.add(str + root.val);
        if(root.left!=null) print(root.left,str+(root.val+ "->"),ans);
        if(root.right!=null) print(root.right,str+(root.val+ "->"),ans);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();

        if(root!=null) print(root,"",ans);
        return ans;
    }
}