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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        inOrder(root, li);
        return createTree(0, li.size()-1, li);
    }

    public TreeNode createTree(int l, int r, List<Integer> li){
        if(l>r)
            return null;
        int m = l+(r-l)/2;
        TreeNode root = new TreeNode();
        root.val = li.get(m);
        root.left = createTree(l, m-1, li);
        root.right = createTree(m+1, r, li);

        return root;
    }

    public void inOrder(TreeNode root, List<Integer> li){
        if(root == null)
            return;
        inOrder(root.left, li);
        li.add(root.val);
        inOrder(root.right, li);

        return;
    }
}