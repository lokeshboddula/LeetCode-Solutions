class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int  d1 = 0, d2 = 0;
        for(int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            if(i != mat.length - i - 1)
            sum += mat[i][mat.length - i - 1];
        }
        //if((mat.length & 1) == 1) return sum - mat[(mat.length / 2)][(mat.length / 2)];
        return sum;
    }
}