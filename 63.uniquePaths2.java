class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0] == 1)
            return 0;
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int[] arr : dp)
            Arrays.fill(arr, -1);
        return solve(obstacleGrid, dp, m-1, n-1);
    }

    public int solve(int[][] arr, int[][] dp, int i, int j){
        if(i >= 0 && j >= 0 && arr[i][j] == 1)
        {
            return dp[i][j] = 0;
        }
        if(i == 0 && j == 0)
            return 1;
        if(i<0 || j<0)
            return 0;
        if(dp[i][j] != -1)
            return dp[i][j];

        int up  = solve(arr, dp, i-1, j);
        int left = solve(arr, dp, i, j-1);
        return dp[i][j] = up + left;
    }
}