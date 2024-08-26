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
    public List<Integer> postorder(Node root) {
        List<Integer> post = new ArrayList<>();
        if(root == null)
            return post;

        traverse(post, root);

        return post;
    }

    public void traverse(List<Integer> li, Node root){
        if(root == null)
            return;
        for(Node childNode : root.children){
            traverse(li, childNode);
        }

        li.add(root.val);
    }
}