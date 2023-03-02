class Solution {
    public int compress(char[] chars) {
        String ans = chars[0] + "";
        int count = 1;
        for(int i = 1; i < chars.length; i++) {
            if(chars[i] == chars[i - 1]) {
                count++;
            } else {
                if(count > 1)
                ans += count + "" + chars[i];
                else ans += chars[i];
                count = 1;
            }
        }
        if(count > 1)
        ans += "" + count;
        for(int i = 0; i < ans.length(); i++) {
            chars[i] = ans.charAt(i);
        }
        System.out.print(count);
        return ans.length();
    } 
}