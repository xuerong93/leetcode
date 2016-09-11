public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int maxProfit = 0;
        int maxPrice = Integer.MIN_VALUE;
        for(int i = prices.length-1; i > 0; i++){
            maxPrice = maxPrice > prices[i] ? maxPrice : prices[i];
            maxProfit = maxProfit > (maxPrice - prices[i]) ? maxProfit : (maxPrice - prices[i]);
        }
        return maxProfit;
    }
}