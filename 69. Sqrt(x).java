class Solution {
    public int mySqrt(int x) {
        int ans = 0;
        long mid = 1;
        while(mid * mid <= x) {
            mid++;
        }
        return (int) mid - 1;
    }
}