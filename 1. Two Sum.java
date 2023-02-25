class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(target - arr[i])){
                res[0] = i;
                res[1] = map.get(target - arr[i]);
                break;
            }
            map.put(arr[i], i);
        }
        return res;
    }
}