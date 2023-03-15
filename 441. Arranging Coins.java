class Solution {
    public int arrangeCoins(int n) {
        // O(N)
        // if(n == 1) return 1;
        // int i = 1;
        // for(; n > 0; n = n - i) i++;
        // return i - 1;
        // ----------------------------------
        // log(N)
        // long low = 0; 
        // long high = n;
        // long ans = 0;
        // while(low <= high) {
        //     long mid = low + (high - low) / 2;
        //     if((mid * (mid + 1)) / 2 <= n) {
        //         ans = mid;
        //         low = mid + 1;
        //     }
        //     else high = mid - 1;
        // }
        // return (int)ans;
        //-------------------------------------
        // O(1) 
        // let us assume k is our ans then (k (k + 1)) / 2 <= N
        // k^2 + k <= 2N solving this equation will give us
        // sqrt of (2 * n + 1 / 4) + 1/ 2 = k
        return (int) (Math.sqrt(2 * (long)n + 0.25) - 0.5);
    }
}