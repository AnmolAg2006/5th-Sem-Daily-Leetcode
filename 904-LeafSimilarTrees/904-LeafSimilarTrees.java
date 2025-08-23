// Last updated: 8/23/2025, 10:27:51 PM
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        buildLeafString(root1, s1);
        buildLeafString(root2, s2);
        return s1.toString().equals(s2.toString());
    }
    public void buildLeafString(TreeNode node, StringBuilder sb) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            sb.append(node.val).append("-");
            return;
        }
        buildLeafString(node.left, sb);
        buildLeafString(node.right, sb);
    }
}