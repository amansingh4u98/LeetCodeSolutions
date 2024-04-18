class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1) {
            TreeNode ans = new TreeNode(val);
            ans.left = root;
            root = ans;
            return root;
        }
        Queue<TreeNode> ansList = new LinkedList<>();
        ansList.add(root);
        // Here depth-->2 because root (depth 1) is already present in the ansList and we needed depth-1 row in this method
        while(depth-->2 && !ansList.isEmpty()) {
            int size = ansList.size();
            while(size-->0) {
                TreeNode temp = ansList.poll();
                if(temp.left != null)   ansList.add(temp.left);
                if(temp.right != null)  ansList.add(temp.right);
            }
        }
        // We have the depth-1 row in ansList... just add left-right treeNode and finish
        while(!ansList.isEmpty()) {
            TreeNode polledNode = ansList.poll();
            TreeNode newNodeL = new TreeNode(val);
            TreeNode newNodeR = new TreeNode(val);
            newNodeL.left = polledNode.left;
            newNodeR.right = polledNode.right;
            polledNode.left = newNodeL;
            polledNode.right = newNodeR;
        }
        return root;
    }
}