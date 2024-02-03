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
    int max = 0;  // we can either use a global variable or use an array declaration and store the ans as an array element
    public int diameterOfBinaryTree(TreeNode root) {
        int ht = height(root);
        return max;
    }

    public int height(TreeNode root){
        if(root == null)
            return 0;
        
        int lh = height(root.left);
        int rh = height(root.right);
        max = Math.max(max, lh + rh);

        return 1 + Math.max(lh, rh);
    }
}