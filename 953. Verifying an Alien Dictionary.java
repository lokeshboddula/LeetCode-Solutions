class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] map = new int [26];
        int seq = 0;
        for(char ch : order.toCharArray()) {
            map[ch - 'a'] = seq++;
        }
        for(int i = 0; i < words.length - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];
            int len = Math.min(s1.length(), s2.length());
            if (s1.length() != len && 
            s2.length() == len && 
            s1.startsWith(s2)) return false;
            for(int l = 0; l < len; l++) {
                if(map[s1.charAt(l) - 'a'] > map[s2.charAt(l) - 'a']) {
                    return false;
                }
                if(map[s1.charAt(l) - 'a'] < map[s2.charAt(l) - 'a']) {
                    break;
                }
             }
        }
        return true;
    }
}