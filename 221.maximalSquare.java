class Solution {
    public int maximalSquare(char[][] matrix) {
       int m = matrix.length, n = matrix[0].length;
       int[][] dp = new int[m][n];
       int max = 0;

       for(int i=0; i<m; i++){
           for(int j=0; j<n; j++){
               if(matrix[i][j] == '0' || i == 0 || j==0){
                   dp[i][j] = Character.getNumericValue(matrix[i][j]);
               }
               else{
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1;
               }
               if(dp[i][j] > max){
                       max = dp[i][j];
                   }
           }
       }
       return max*max; 
    }
}