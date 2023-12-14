class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] rOne = new int[m];
        int[] cOne = new int[n];
        int[] rZero = new int[m];
        int[] cZero = new int[n];
        int[][] diff = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    rOne[i]++;
                    cOne[j]++;
                }
                else if(grid[i][j] == 0){
                    rZero[i]++;
                    cZero[j]++;
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                diff[i][j] = rOne[i] + cOne[j] - rZero[i] - cZero[j];
            }
        }
        return diff;
    }
}