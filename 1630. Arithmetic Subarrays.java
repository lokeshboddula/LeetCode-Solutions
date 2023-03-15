class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();
        for(int i = 0; i < l.length; i++) {
            List<Integer> query = new ArrayList<>();
            for(int j = l[i]; j <= r[i]; j++) query.add(nums[j]);
            Collections.sort(query);
            //System.out.print(query);
            int diff = 0;
            diff = query.get(1) - query.get(0);
            boolean flag = true;
            for(int j = 0; j < query.size() - 1; j++) {
                if(query.get(j + 1) - query.get(j) != diff) {
                    res.add(false);
                    flag = false;
                    break;
                }
            }
            if(flag) res.add(flag);
        }
        return res;
    }
}