class Solution {
    public boolean isMonotonic(int[] nums) {
        int inc = 1, dec = 1;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] <= nums[i + 1]) inc++;
            if(nums[i] >= nums[i + 1]) dec++;
        }
        if(inc == nums.length || dec == nums.length) return true;
        return false;
    }
}