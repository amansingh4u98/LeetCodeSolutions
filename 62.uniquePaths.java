class Solution {
    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n]; // this dp maintains the count of ways you can reach at any dp[i][j] from i=0 and j=0
        for(int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        return recur(dp, m-1, n-1);
    }

    public int recur(int[][] dp, int i, int j){
        if(i==0 && j==0)
            return 1;
        if(i<0 || j<0)
            return 0;
        
        if(dp[i][j] != -1)
            return dp[i][j];
        
        int up = recur(dp, i-1, j);
        int left = recur(dp, i, j-1);

        return dp[i][j] = up + left;
    }

    // Bottom-up dp solution

     public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i ==0 && j==0)
                    dp[i][j] = 1;
                else{
                    int up = 0, left = 0;
                    if(i > 0)
                        up = dp[i-1][j];
                    if(j > 0)
                        left = dp[i][j-1];
                    
                    dp[i][j] = up + left;
                }
            }
        }
        return dp[m-1][n-1];
    }
}