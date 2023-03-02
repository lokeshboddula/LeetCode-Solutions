class Solution {
    public int hammingDistance(int a, int b) {
        int c = a ^ b;
		int count = 0;
		while (c > 0) {
			if ((c & 1) == 1) count++;
			c >>= 1;
 		}
		return count;
    }
}