class Solution {
    static String reverse(String str){
        String str2 = "";
        for(int i=0; i<str.length(); i++){
            str2 = str.charAt(i) + str2;
        }
        return str2;
    }
    public String reverseWords(String s) {
        String s1= "";
        int pos = 0;
        for(int i=0; i< s.length(); i++){
            
            if(s.charAt(i) == ' '){
                s1 += reverse(s.substring(pos, i)) +" ";
                pos = i+1;
            }
        }
        s1 += reverse(s.substring(pos, s.length()));
        return s1;
    }
}