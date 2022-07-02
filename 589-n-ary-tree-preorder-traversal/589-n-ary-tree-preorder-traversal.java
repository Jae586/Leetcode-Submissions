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
    public List<Integer> preorder(Node root) {
        LinkedList<Node>list = new LinkedList<>();
        LinkedList<Integer> finalL = new LinkedList<>();
        
        if (root == null) return finalL;
        list.add(root);
        
        while(!list.isEmpty()){
            Node node = list.pollLast();
            finalL.add(node.val);
            Collections.reverse(node.children);
            for (Node child : node.children)
                list.add(child);
            
        }
        return finalL;
    }
}