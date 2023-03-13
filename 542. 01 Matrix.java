class Solution {
    class Data {
        int i;
        int j;
        int count;
        Data(int i, int j, int count) {
            this.i = i;
            this.j = j;
            this.count = count;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] drow = {0, 0, 1, -1};
        int[] dcol = {1, -1, 0, 0};

        int[][] visited = new int[m][n];

        for (int[] row : visited)
            Arrays.fill(row, -1);

        Queue<Data> q = new LinkedList<>();
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] == 0) {
                    visited[i][j] = 0;
                    q.add(new Data(i, j, 0));
                }
            }
        }
        while(q.size() > 0) {
            Data d = q.remove();
            int i = d.i;
            int j = d.j;
            int c = d.count;
            for(int k = 0; k < 4; k++) {
                int crow = drow[k] + i;
                int ccol = dcol[k] + j;
                if(crow >= 0 && crow < mat.length 
                && ccol >= 0 && ccol < mat[0].length)  {
                    if(visited[crow][ccol] == -1) {
                        q.add(new Data(crow, ccol, c + 1));
                        visited[crow][ccol] = c + 1;
                    }
                }
            }
        }

        return visited;
    }
}