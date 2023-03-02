class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if((i + 2) < s.length() && s.charAt(i + 2) == '#') {
                String temp = s.substring(i, i + 2);
                int num = Integer.parseInt(temp);
                char t = (char) (num + 96);
                sb.append(t);
                i += 2;
            } else {
                 char t = (char) (s.charAt(i) + 48);
                sb.append(t);
            }
        }
        return sb.toString();
    }
}