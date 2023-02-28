class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        if(mat.length == 0) return false;
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high =(n * m) - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(target == mat[mid / m][mid % m]) {
                return true;
            } else if(target > mat[mid / m][mid % m]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}