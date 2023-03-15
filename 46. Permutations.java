class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> temp = new ArrayList();
        boolean[] visited = new boolean[nums.length];
        helper(nums, ans, temp, visited);
        return ans;
    }
    static void helper(int[] nums,List<List<Integer>> ans,
        List<Integer> temp, boolean[] visited){
        if(temp.size() == nums.length){
            ans.add(new ArrayList(temp));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(visited[i]) continue;
            temp.add(nums[i]);
            visited[i] = true;
            helper(nums, ans, temp, visited);
            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
        
    }
}