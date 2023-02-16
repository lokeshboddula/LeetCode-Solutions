//Using prefix sum
class NumMatrix {
    int[][] pref;
    public NumMatrix(int[][] arr) {
        int n = arr.length;
		int m = arr[0].length;
		pref = new int[n][m];
        // building prefix sum 2D array
        for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr[0].length; j++) {
				int A = arr[i][j];
				int B = j - 1 >= 0 ? pref[i][j - 1] : 0;
				int C = i - 1 >= 0 ? pref[i - 1][j] : 0;
				int D = i - 1 >= 0 && j - 1 >= 0 ? pref[i - 1][j - 1] : 0;
				pref[i][j] = A + B + C - D;
			}
		}
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        // getting answers for each query
			int r1 = row1;
			int c1 = col1;
			int r2 = row2;
			int c2 = col2;
			int A = pref[r2][c2];
			int B = c1 - 1 >= 0 ? pref[r2][c1 - 1] : 0;
			int C = r1 - 1 >= 0 ? pref[r1 - 1][c2] : 0;
			int D = r1 - 1 >= 0 && c1 - 1 >= 0 ? pref[r1 - 1][c1 - 1] : 0;
			int result = A - B - C + D;
			return result;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */