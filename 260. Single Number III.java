class Solution {
    public int[] singleNumber(int[] nums) {
       
		int xorOfNums = 0;
		//taking XOR of all array elements
		for (int num : nums) {
			xorOfNums ^= num;
		}
		int k = 0;
		//finding rightmost set bit from xorOfNums
		while ((xorOfNums & 1<<k) == 0) k++;
		//getting a binary version with set bit at k
		k = 1 << k;
		//getting two groups with set bit at k and otherwise
		int setWithKthBitSet = 0;
		int setWithKthBitNotSet = 0;
		
		for(int num : nums) {
			if((num & k) == 0) {
				setWithKthBitSet ^= num;
			} else {
				setWithKthBitNotSet ^= num;
			}
		}
        int ans[] = {setWithKthBitSet, setWithKthBitNotSet};
        return ans;
    }
}