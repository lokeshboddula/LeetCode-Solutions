class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int[][] visited = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] != 0) {
                    int area = dfs(i, j, grid, visited);
                    System.out.print(area + " ");
                    maxArea = Math.max(area, maxArea);
                }
            }
        }
        return maxArea;
    }
    public int dfs(int i, int j, int[][] grid, 
                        int[][] visited) {
        if(i < 0 || j < 0 ||
         i > grid.length - 1||
          j > grid[0].length - 1 || grid[i][j] == 0 || visited[i][j] == 1) return 0;
        visited[i][j] = 1;
       
        return 1 + dfs(i - 1, j, grid, visited) +
        dfs(i, j - 1, grid, visited) +
        dfs(i + 1, j, grid, visited) +
        dfs(i, j + 1, grid, visited);
        
    }
}