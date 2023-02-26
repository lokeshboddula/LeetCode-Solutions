class Solution {
    public boolean checkStraightLine(int[][] cd) {
        int diff1 = cd[1][0] - cd[0][0];
        int diff2 = cd[1][1] - cd[0][1];
        int x = 0, y = 0;
        
        for(int i = 0; i < cd.length; i++) {
            int xdiff = cd[i][0] - cd[1][0];
            int ydiff = cd[i][1] - cd[1][1];
            if(xdiff * diff2 != ydiff * diff1) return false;
        }
        return true;
    }
}