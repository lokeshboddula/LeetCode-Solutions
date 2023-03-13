class Solution {
    //optimised takes n * n time and O(1) space
     public boolean findRotation(int[][] mat, int[][] target) {
        // we count elements which match at each rotation 
        // and if there is complete match we return true;
        int r90 = 0;
        int r180 = 0;
        int r270 = 0;
        int r360 = 0;
        int n = mat.length;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                if(target[i][j] == mat[n - j - 1][i]) r90++;
                if(target[i][j] == mat[n - i - 1][n - j -1]) r180++;
                if(target[i][j] == mat[j][n - i - 1]) r270++;
                if(target[i][j] == mat[i][j]) r360++;
            }
        }
        int eleCnt = n * n;
        if(r90 == eleCnt || r180 == eleCnt ||
         r270 == eleCnt || r360 == eleCnt) return true;
        return false;
    }

    // // Brute Force uses extra space of 4 * (n * n) and tc : 4 * (n * n)
    // public int[][] rotate(int[][] mat) {
    //     int[][] rotated = new int[mat.length][mat[0].length];
    //     for(int i = 0; i < mat.length; i++) {
    //         for(int j = 0; j < mat[0].length; j++) {
    //             rotated[j][mat.length - i - 1] = mat[i][j];
    //         }
    //     }
    //     return rotated;
    // }
    // public boolean checkIfMatched(int[][] mat, int[][] target) {
    //     for(int i = 0; i < mat.length; i++) {
    //         for(int j = 0; j < mat[0].length; j++) {
    //             if(mat[i][j] != target[i][j]) return false;
    //         }
    //     }
    //     return true;
    // }
    // public boolean findRotation(int[][] mat, int[][] target) {
    //     for(int i = 0; i < 4; i++) {
    //         if(checkIfMatched(mat, target)) return true;
    //         mat = rotate(mat);
    //     }
    //     return false;
    // }
}