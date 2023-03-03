class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.substring(i).startsWith(needle)) {
                return i;
            }
        }
        return -1;
    }
}