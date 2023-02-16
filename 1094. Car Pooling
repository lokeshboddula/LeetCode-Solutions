class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] stops = new int[1001];
		//adding and removing passengers at respective stops
		for (int i = 0; i < trips.length; i++) {
			stops[trips[i][1]] += trips[i][0];
			stops[trips[i][2]] -= trips[i][0];
		}
		//creating prefix step array
		for (int i = 1; i < 1001; i++) {
			stops[i] = stops[i] + stops[i - 1];
		}
	    	// checking if the capacity is exceeded at any stop
		for (int i = 0; i < 1001; i++) {
			if (stops[i] > capacity) return false;
		}
	return true;
    }
}