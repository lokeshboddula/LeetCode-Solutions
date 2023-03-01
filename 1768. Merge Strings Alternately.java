class Solution {
    public String mergeAlternately(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
		int n = Math.min(s1.length(), s2.length());
		for(int i=0; i<n; i++){
			sb.append(s1.charAt(i));
			sb.append(s2.charAt(i));
		}
		if(s1.length() < s2.length()){
			return sb.toString() + s2.substring(s1.length());
		}
		return sb.toString() + s1.substring(s2.length());
    }
}