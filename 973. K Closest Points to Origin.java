class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res = new int[k][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> (x[0] * x[0] 
                                + x[1] * x[1]) - (y[0] * y[0] + y[1] * y[1]));
        
        for(int[] p : points) {
            pq.add(p);
        }
        for(int i = 0; i < k; i++) {
            int[] t = pq.poll();
            res[i][0] = t[0];
            res[i][1] = t[1];
        }
        return res;

    }
}