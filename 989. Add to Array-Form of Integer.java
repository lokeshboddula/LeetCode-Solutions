class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < num.length; i++) ans.add(0);
        int i = 0;
        int carry = 0;
        while(i < num.length) {
            int kval = k % 10;
            k = k / 10;
            int j = num.length - 1 - i;
            i++;
            int sum = num[j] + kval + carry;
            carry = sum / 10;
            ans.set(j, sum % 10);
        }
        System.out.println(k);
        if(carry != 0 && k == 0) {
            ans.add(0, carry);
            return ans;
        } 
        while(k != 0) {
            ans.add(0, ((k % 10) + carry) % 10);
            carry = ((k % 10) + carry) / 10;
            k /= 10;
        }
        if(carry != 0) ans.add(0, carry);
        return ans;
    }
}