// Last updated: 8/23/2025, 10:28:06 PM
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
}
*/

class Solution {
    public static void po(Node root,List<Integer>l)
    {
        if(root==null)
        {
            return;
        }
        for(Node temp:root.children)
        {
            po(temp,l);
        }
        l.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer>l=new ArrayList<>();
        po(root,l);
        return l;
    }
}