public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int profit = 0;
        for(int i = 0; i < prices.length-1; i++){
            int pro = prices[i+1] - prices[i];
            if(pro > 0){
                profit += pro;
            }
        }
        return profit;
        
    }
}