class Solution {
    static int count;
    static class Pair{
        int root_val;
        int cnt;
        Pair(int root_val,int cnt){
            this.root_val=root_val;
            this.cnt=cnt;
        }
    }
    public static Pair calc(TreeNode root){
        if(root==null) return new Pair(0,0);
        Pair left=calc(root.left);
        Pair right=calc(root.right);
        int tot_sum=left.root_val+right.root_val+root.val;
        int tot_nodes=left.cnt+right.cnt+1;
        if(tot_sum/tot_nodes==root.val) count++;
        return new Pair(left.root_val+right.root_val+root.val,left.cnt+right.cnt+1);
    }
    public int averageOfSubtree(TreeNode root) {
        count=0;
        calc(root);
        return count;
    }
}