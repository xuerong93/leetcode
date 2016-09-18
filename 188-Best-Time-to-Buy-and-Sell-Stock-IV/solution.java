public class Solution {
    public int maxProfit(int k, int[] prices) {
        if(prices == null || prices.length <2) return 0;
        if(prices.length<=k) return maxProfit2(prices);
        //T[i][j], i is the transaction num and j is the day, it is the max of T[i][j-1](no transaction on jth day) or (T[i-1][m]+prices[j]-prices[m], m is the buying day)
        //for the same j, prices[j] is constant, the change thing is T[i-1][m]-prices[m]
        int[][] maxProfit = new int[k+1][prices.length];
        
        for(int i = 1;i<=k; i++){
            for(int j=1; j<prices.length;j++){
                 int maxVal = 0;
                 for(int m = 0; m < j ;m++){
                     
                     maxVal = Math.max(maxVal, maxProfit[i-1][m] + prices[j] - prices[m]);
                 }
                 maxProfit[i][j] = Math.max(maxProfit[i][j-1],maxVal);
            }
        }
        return maxProfit[k][prices.length-1];
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