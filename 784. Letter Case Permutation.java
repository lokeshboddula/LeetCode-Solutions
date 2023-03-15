class Solution {
    public void helper(char c, int pos, List<String> res){
        int i = 0;
        int count = res.size();
        while(i < count) {
            char[] temp = res.get(i++).toCharArray();
            temp[pos] = c;
            res.add(new String(temp));
        }
    }
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        s = s.toLowerCase();
        res.add(s);
        char[] temp = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLetter(ch)) {
                String t = ch + "";
                t = t.toUpperCase();

                helper(t.charAt(0), i, res);
            }
        }
        return res;
    }
}