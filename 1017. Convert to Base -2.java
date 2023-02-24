class Solution {
    public String baseNeg2(int N) {
        //same as base +2 but while right shifting we negate the value
        StringBuilder res = new StringBuilder();
        while (N != 0) {
            res.append(N & 1);
            N = -(N >> 1);
            System.out.print(N + " ");
        }
        return res.length() > 0 ? res.reverse().toString() : "0";
    }
}