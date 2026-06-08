class Solution {
    public int maxProfit(int[] prices) {
        int prevLow = prices[0];
        int maxProf = 0;
        int curPrice;
        for (int i = 1; i < prices.length; i++) {
            curPrice = prices[i];
            if (curPrice > prevLow) {
                maxProf = Math.max(maxProf, curPrice - prevLow);
            } else {
                prevLow = curPrice;
            }
        }
        return maxProf;
    }
}