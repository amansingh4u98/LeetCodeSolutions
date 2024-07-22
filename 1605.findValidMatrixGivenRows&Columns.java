class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length, n = colSum.length;
        int i = 0, j = 0;
        int[][] ans = new int[m][n];
        while(i<m && j<n){
            ans[i][j] = Math.min(rowSum[i], colSum[j]);
            rowSum[i] -= ans[i][j];
            colSum[j] -= ans[i][j];

            if(rowSum[i] == 0)
                i++;
            if(colSum[j] == 0)
                j++;
        }
        return ans;
    }
}