class Solution {
    public int arraySign(int[] nums) {
        int negatives = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) return 0;
            if(nums[i] < 0) negatives++;
        }
       if((negatives & 1) == 1) return -1;
       else return 1;
       
    }
}