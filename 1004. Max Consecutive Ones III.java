class Solution {
    public int longestOnes(int[] nums, int k) {
        int s = 0;
        int e = 0;
        int max = 0;
        while (e < nums.length) {
           if(nums[e] == 0) k--;

           if(k < 0) {
               if (nums[s] == 0) {
                   k++;
               }
               s++;
           }
           e++;
        }
        return e - s;
    }
}