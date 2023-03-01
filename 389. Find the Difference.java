class Solution {
    public char findTheDifference(String s, String t) {
        int[] tfreq = new int[130];
        // a freq array to store t frequency then removing s frequency 
        //will give us required output
        for(int i = 0; i < t.length(); i++) {
            tfreq[t.charAt(i)]++; 
        }
        
        for(int i = 0; i < s.length(); i++) {
            tfreq[s.charAt(i)]--; 
        }
         
        for(int i = 0; i < tfreq.length; i++) {
            if(tfreq[i] > 0) {
                return (char) i;
            } 
        }
        return '.';
    }
}