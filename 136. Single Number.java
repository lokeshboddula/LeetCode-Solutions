class Solution {
    // O(N) Approach
    public int singleNumber(int[] nums) {
        //get xor of all elements 
        // left number is the single among all
        int ans = 0;
        for(int num : nums){
            ans ^= num;
        }
        return ans;
    }
}
// ----------------------------------------------------------
// O (N log N) Approach
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1) return nums[0];
        for(int i=0; i< nums.length-1; i++){
            if(nums[i] == nums[i+1] ){
                i++;
            }
            else{
                if(nums[i] < nums[i+1]){
                    return nums[i];
                }
                else{
                    return nums[i+1];
                }
            }
            
        }
        return nums[nums.length-1];
    }
}