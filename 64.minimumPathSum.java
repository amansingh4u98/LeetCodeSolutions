// Bottom up approach to solve the question
class Solution {
    public int minPathSum(int[][] grid) {
        
        int[][] dp = new int[grid.length][grid[0].length];

        for(int row = 0; row < grid.length; row++) {
            for(int col = 0; col < grid[0].length; col++) {

                if(row == 0 && col == 0) {
                    dp[row][col] = grid[row][col]; 
                }
                else {
                    int down = Integer.MAX_VALUE;
                    int right = Integer.MAX_VALUE;

                    if(row > 0) {
                        down = grid[row][col] + dp[row - 1][col];
                    }
                    if(col > 0) {
                        right = grid[row][col] + dp[row][col - 1];
                    }

                    dp[row][col] = Math.min(right, down);
                }
            }
        }

        return dp[grid.length - 1][grid[0].length - 1];
    }
}