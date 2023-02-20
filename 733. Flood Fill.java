class Solution {
    //DFS
    public void dfs (int newImage[][], int[][] image, int sr, int sc, 
    int color, int[] row, int[] col, int iniColor) {
        newImage[sr][sc] = color;
        for (int i = 0; i < 4; i++) {
            int nrow = sr + row[i];
            int ncol = sc + col[i];
            if(nrow >= 0 && nrow < image.length && ncol >= 0 
            && ncol < image[0].length && image[nrow][ncol] == iniColor &&
            newImage[nrow][ncol] != color) {
                newImage[nrow][ncol] = color;
                dfs(newImage, image, nrow, ncol, color, row, col, iniColor);
            }
        }
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // to store the result
        int newImage[][] = image;
        int iniColor = image[sr][sc];
        // to traverse in 4 directions we use these two arrays to mark the co ordinates
        int[] row = {-1, 0, 1, 0};
        int[] col = {0, 1, 0, -1};
        dfs (newImage, image, sr, sc, color, row, col, iniColor);
        return newImage;
    }
}