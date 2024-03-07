class Solution {
    static class Pair {
   int first;
   int second;
   int time;

   Pair(int first, int second, int time) {
       this.first = first;
       this.second = second;
       this.time = time;
   }
} 
   public int orangesRotting(int[][] grid) {
      int m = grid.length, n = grid[0].length;
      int[][] vis = new int[m][n];
      int cnt = 0, freshCnt = 0, min = 0;
      Queue<Pair> q = new LinkedList<>();
      for(int row=0; row<m; row++){
          for(int col=0; col<n; col++){
              if(grid[row][col] == 2){
                  q.add(new Pair(row, col, 0));
                  vis[row][col] = 2;
              }
              if(grid[row][col] == 1){
                  freshCnt++;
              }
          }
      }
      int[] delRow = {-1, 0, 1, 0};
      int[] delCol = {0, 1, 0, -1};

      while(!q.isEmpty()){
          int r = q.peek().first;
          int c = q.peek().second;
          int t = q.peek().time;
          min = Math.max(min, t);
          q.poll();
          for(int i=0; i<4; i++){
              int nrow = r + delRow[i];
              int ncol = c + delCol[i];
              if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
                  vis[nrow][ncol] = 2;
                  q.add(new Pair(nrow, ncol, t + 1));
                  cnt++;
              }
          }
      }
      if(cnt != freshCnt)
           return -1;
       
       return min;
   }
}