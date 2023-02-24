class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxPerimeter = 0;
        for(int i = 0; i < n - 2; i++) {
            if(nums[i] + nums[i + 1] > nums[i + 2]) {
                int perimeter = nums[i] + nums[i + 1] + nums[i + 2];
                maxPerimeter = Math.max(maxPerimeter, perimeter);
            }
        }
        return maxPerimeter;
    }
}