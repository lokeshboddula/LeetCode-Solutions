class Solution {
    public String addBinary(String a, String b) {
       int i = a.length() - 1;
       int j = b.length() - 1;
       int carry = 0;
       String sol = "";
       while(i >= 0 || j >= 0) {
           int ival = i >= 0 ? a.charAt(i--) - '0' : 0;
           int jval = j >= 0 ? b.charAt(j--) - '0' : 0;
           int sum = ival + jval + carry;
           sol = sum % 2 + sol;
           carry = sum / 2;
       }
       if(carry != 0) sol = carry + sol;
       return sol;
    }
}