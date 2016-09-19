public class Solution {
    public int maxProfit(int k, int[] prices) {
        if (prices.length < 2) return 0;
        
        int days = prices.length;
        if (k >= days) return maxProfit2(prices);
        //there must be a transaction on local
        int[][] local = new int[days][k + 1];
        //there may not be a transaction on global
        int[][] global = new int[days][k + 1];
        
        for (int i = 1; i < days ; i++) {
            int diff = prices[i] - prices[i - 1];
            
            for (int j = 1; j <= k; j++) {
                //j-1th transaction on the first i-1 days and the jth day with one transaction or   on i-1th day it sells but on ith day it also sells, the sell action can be combined 
                local[i][j] = Math.max(global[i - 1][j - 1]+Math.max(diff,0), local[i - 1][j] + diff);
                //global benefit may be the profit until i-1th day or the jth transcation on ith day. 
                global[i][j] = Math.max(global[i - 1][j], local[i][j]);
             }
        }
        
        return global[days - 1][k];
    }
    
    
    public int maxProfit2(int[] prices) {
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        
        return maxProfit;
    }
    
    
   
}