class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        int[] freq = new int[123];
        // we have two things to notice
        // 1) if the strings have same no of characters using freq array
        // 2) if the chars to swap are more then two (then it is not possible)
        for(int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 123; i++) {
            if(freq[i] > 0) return false;
        }

        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
        }
        if (count < 3) return true;
        return false;
    }
}