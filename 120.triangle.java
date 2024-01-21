class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp = new int[m][m];
        for(int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        return solve(triangle, 0, 0, m, dp);
    }

    public int solve(List<List<Integer>> tri, int i, int j, int m, int[][] dp){
        if(i == m-1)
            return tri.get(i).get(j);
        
        if(dp[i][j] != -1)
            return dp[i][j];
        int down = tri.get(i).get(j) + solve(tri, i+1, j, m, dp);
        int diagonal = tri.get(i).get(j) + solve(tri, i+1, j+1, m, dp);

        return dp[i][j] =  Math.min(down, diagonal);
    }
}