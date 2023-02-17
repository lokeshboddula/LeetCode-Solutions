class Solution {
    //pair class for storing co-ordinates
    class Pair {
        int first;
        int second;
        Pair (int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    //bfs
    public void bfs (int row, int col, boolean visited[][], char[][] grid, int[] drow, int[] dcol) {
        visited[row][col] = true;
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair (row, col));
        while (!q.isEmpty()) {
            int crow = q.peek().first;
            int ccol = q.peek().second;
            q.remove();
                
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < m; j++) {
                        int trow = crow + drow[i];
                        int tcol = ccol + dcol[i];
                        if (trow >= 0 && trow < n && tcol >= 0 && tcol < m && 
                            !visited[trow][tcol] && grid[trow][tcol] == '1') {
                                visited[trow][tcol] = true;
                                q.add(new Pair (trow, tcol)); 
                        }
                    }
                }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][] = new boolean[n][m];
        int count = 0;
        //delta row & col for checking neibhours in 4 directions up down right left
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if(!visited[row][col] && grid[row][col] == '1') {
                    count++;
                    bfs(row, col, visited, grid, drow, dcol);
                } 
            }
        }
        return count;
    }
}