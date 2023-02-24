class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans = 0;
        int mdist = Integer.MAX_VALUE;
        int tempdist =  Integer.MAX_VALUE;
        for(int i = 0; i < points.length; i++) {
            if(x == points[i][0] || y == points[i][1]) {
                tempdist = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
            }
                
            if(tempdist < mdist) {
                ans = i;
                mdist = tempdist;
            }
        }
        return mdist == Integer.MAX_VALUE ? -1 : ans;
    }
}