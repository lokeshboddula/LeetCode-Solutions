class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if(ch != '.') {
              //add method returns false if it already has that perticular value  
                    if(!seen.add(ch + "found in row" + i) || 
                    !seen.add(ch + "found in column" + j) ||
                    !seen.add(ch + "found in box" + i / 3 + " " + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}