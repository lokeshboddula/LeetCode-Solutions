class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] resultant = new int[n];
        int rotationPoint = k % n;
        int dissectionPoint = n - rotationPoint;
        int idx = 0;
        for(int i = dissectionPoint; i < n; i++){
            resultant[idx++] = nums[i];
        }
        for(int i = 0; i < dissectionPoint; i++){
            resultant[idx++] = nums[i];
        }
        for(int i = 0; i < n; i++) {
            nums[i] = resultant[i];
        }
    }
}