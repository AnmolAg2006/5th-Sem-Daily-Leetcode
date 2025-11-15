// Last updated: 11/15/2025, 7:44:17 PM
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit;
        int maxProfit = 0;
        for(int i = 1; i< prices.length; i++) {
            // find min price to sell
            minPrice = Math.min(minPrice, prices[i]);
            profit = prices[i] - minPrice;
            maxProfit = Math.max(profit, maxProfit);
        }
      return maxProfit;
    }
}