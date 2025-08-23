// Last updated: 8/23/2025, 10:29:59 PM
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
        func(root,targetSum,ans,new ArrayList<>(),0);
        return ans;
    }
    public static void func(TreeNode root,int targetSum, List<List<Integer>>ans,List<Integer>temp,int sum)
    {
        if(root==null)
        {
            return;
        }
        temp.add(root.val);
        if(root.left==null && root.right==null)
        {
            if(sum+root.val==targetSum)
            {
                // temp.add(root.val);
                ans.add(new ArrayList(temp));
            }
        }
        func(root.left,targetSum,ans,temp,sum+root.val);
        func(root.right,targetSum,ans,temp,sum+root.val);
        temp.remove(temp.size()-1);
    }
}