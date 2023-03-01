class Solution {
    public String interpret(String com) {
        String s ="";
        for(int i=0; i<com.length(); i++){
            char ch = com.charAt(i);
            if(ch == 'G'){
                s+= ch;
            }
            if(ch == '(' && com.charAt(i+1) == ')'){
                s+= 'o';
            }
            if(ch == '(' && com.charAt(i+1) == 'a'){
                s+= "al";
            }
        }
        return s;
    }
}