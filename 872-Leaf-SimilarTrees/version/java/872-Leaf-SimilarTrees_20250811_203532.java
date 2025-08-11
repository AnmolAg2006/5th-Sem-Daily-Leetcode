// Last updated: 8/11/2025, 8:35:32 PM
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
    public static void getLeaf(TreeNode root,ArrayList<Integer>arr)
    {
        if(root==null)
        {
            return ;
        }
        if(root.left==null && root.right==null)
        {
            arr.add(root.val);
            return ;
        }
        getLeaf(root.left,arr);
        getLeaf(root.right,arr);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer>arr1=new ArrayList<>();
        ArrayList<Integer>arr2=new ArrayList<>();
        getLeaf(root1,arr1);
        getLeaf(root2,arr2);
        System.out.print(arr1+" "+arr2);
        if(arr1.size()!=arr2.size())
        {
            return false;
        }
        for(int i=0;i<arr1.size();i++)
        {
            if(!arr1.get(i).equals(arr2.get(i)))
            {
                return false;
            }
        }
        return true;
    }
}