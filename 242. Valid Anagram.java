class Solution {
    public boolean isAnagram(String s, String t) { 
        if(s.length() != t.length()){
            return false;
        }
        //freq array 
        int[] alphabet = new int[26];
        int sum = 0;
        for(int i=0; i< 26; i++){
            alphabet[i] = 0;
        }
        //adding string s to freq array
        for(int i = 0; i<s.length(); i++){
            alphabet[s.charAt(i)-'a']++;
        }
        // removing string t from freq array
        for(int i = 0; i<t.length(); i++){
            alphabet[t.charAt(i)-'a']--;
        }
        //A valid anagram will leave the freq array with 0s
        for(int i = 0; i<26; i++){
            if(alphabet[i] != 0){
                return false;
            }
        }
        return true;

    }
}