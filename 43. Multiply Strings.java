class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int l1 = num1.length();
        int l2 = num2.length();
        int[] res = new int[l1 + l2];
        int i = l2 - 1;
        int pf = 0; // power factor (to manage the sum after mutliplication)
        while(i >= 0) {
            int ival = num2.charAt(i) - '0';
            i--;
            int carry = 0;
            int j = l1 - 1;
            int k = res.length - pf - 1;
            while(j >= 0 || carry != 0) {
                int jval = j >= 0 ? num1.charAt(j) - '0' : 0;
                j--;
                int prod = ival * jval + carry + res[k];
                res[k] = prod % 10;
                carry = prod / 10;
                k--;
            }
            pf++;
        }
        System.out.println(Arrays.toString(res));
        String ans  = "";
        boolean flag = false;
        for(int e : res) {
            if(e == 0 && !flag) {
                continue;
            } else {
                flag = true;
                ans += e;
            }
        }
        return ans;
    }
}