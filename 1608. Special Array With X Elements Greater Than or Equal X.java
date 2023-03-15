class Solution {
    public int specialArray(int[] nums) {
        int[] freq = new int[1001];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }
        for (int i = 0; i < 1001; i++) {
            if(i == n) return i;
            n -= freq[i];
        }
        return -1;
    }
}