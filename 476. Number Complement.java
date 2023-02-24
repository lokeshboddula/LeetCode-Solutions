class Solution {
    public int findComplement(int num) {
        int copy = num;
	    int numberOfBits = 0;
		while (copy > 0) {
			numberOfBits++;
			copy >>= 1;
		}
		int temp = (1 << numberOfBits) - 1;
	 return temp ^ num;
    }
}