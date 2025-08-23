// Last updated: 8/23/2025, 10:28:08 PM
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root==null)
        {
            return 0;
        }
        int max=0;
        for(Node temp:root.children)
        {
            max=Math.max(max,maxDepth(temp));
        }
        
        return max+1;
    }
}