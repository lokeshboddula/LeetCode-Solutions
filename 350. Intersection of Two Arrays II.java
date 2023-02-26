class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++) {
            freq[nums1[i]]++;
        }
        for(int i = 0; i < nums2.length; i++) {
            if(freq[nums2[i]] > 0) {
                freq[nums2[i]]--;
                list.add(nums2[i]);
            }
        }
        int i = 0;
        int[] ans = new int[list.size()]; 
        for(int e : list) {
            ans[i++] = e;
        }
        return ans;
    }
}