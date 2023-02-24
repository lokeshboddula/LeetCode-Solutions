class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        // we create a frequency array to 
        //count the occurance of each char in String
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        //we look for the freq of each char
        // in string ans return the first index with freq 1
        for (int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}