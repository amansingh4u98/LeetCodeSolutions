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
    public Map<Integer, Integer> map = new HashMap<>();
    public int max = Integer.MIN_VALUE;
    public int[] findMode(TreeNode root) {
       
        List<Integer> al = new ArrayList<>();
        preOrder(root);
       
        for(int i : map.keySet()){
            if(map.get(i) == max)
                al.add(i);
        }
        int[] ans = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }

        return ans;
    }

    public void preOrder(TreeNode root){
        if(root == null)
            return;
        int temp = root.val;
        if(map.containsKey(temp)){
            map.put(temp, map.get(temp)+1);
        }
        else{
            map.put(temp, 1);
        }
        if(map.get(temp)>max)
            max = map.get(temp);

        preOrder(root.left);
        preOrder(root.right);

    }
}