class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap();
        int len = 0;
        int st = 0, e = 0;
        while (e < s.length()) {
            if(map.containsKey(s.charAt(e))) {
                st = Math.max(map.get(s.charAt(e)) + 1, st);
            }
            map.put(s.charAt(e), e);
            len = Math.max(len, e - st + 1);
            e++;
        }
        return len;
    }
}