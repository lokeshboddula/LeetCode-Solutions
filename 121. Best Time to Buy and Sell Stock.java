class Solution {
    public int maxProfit(int[] prices) {
        int minsf = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (minsf > prices[i]) {
                minsf = prices[i];
                System.out.print(minsf +" ");
            }
            maxProfit = Math.max(maxProfit, prices[i] - minsf);
        }
        return maxProfit;
    }
}