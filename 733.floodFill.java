class Solution {
    private void dfs(int row, int col, int[][] ans, int[][] image, int[] delRow, int[] delCol, int initColor, int newColor){
        ans[row][col] = newColor;
        int m = image.length, n = image[0].length;
        for(int i=0; i<4; i++){
            int nrow = row+delRow[i];
            int ncol = col+delCol[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && image[nrow][ncol] == initColor && ans[nrow][ncol] != newColor){
                dfs(nrow, ncol, ans, image, delRow, delCol, initColor, newColor);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int initColor = image[sr][sc];
        int m = image.length, n = image[0].length;
        int[][] ans = image;
        int delRow[] = {-1, 0, 1, 0};
        int delCol[] = {0, 1, 0, -1};
        dfs(sr, sc, ans, image, delRow, delCol, initColor, newColor);
        return image;
    }

}