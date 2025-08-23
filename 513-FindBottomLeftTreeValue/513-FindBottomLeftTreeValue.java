// Last updated: 8/23/2025, 10:28:35 PM
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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer>arr=new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode currNode=q.poll();
            if(currNode==null)
            {
                if(q.isEmpty())
                {
                    return arr.get(0);
                }
                else{
                    q.add(null);
                    arr.clear();
                }
            }
            else{
                arr.add(currNode.val);
                if(currNode.left!=null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right!=null)
                {
                    q.add(currNode.right);
                }
            }
        }
        return 0;
    }
}