class Solution {
    public int numIslands(char[][] grid) {
       int m = grid.length, n = grid[0].length;
       boolean[][] vis = new boolean[m][n];
       int island = 0;
       for(int row=0; row<m; row++){
           for(int col=0; col<n; col++){
               if(vis[row][col] == false && grid[row][col] == '1'){
                   island++;
                   dfs(row, col, vis, grid);
               }
           }
       }
       return island;
    }
 
    public void dfs(int row, int col, boolean[][] vis, char[][] grid){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col] == '0' || vis[row][col] == true)
            return;
        vis[row][col] = true;
        //traverse the neighbours
        dfs(row+1, col, vis, grid); //front
        dfs(row-1, col, vis, grid); //back
        dfs(row, col-1, vis, grid); //up
        dfs(row, col+1, vis, grid); //down
    }
}