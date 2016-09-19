public class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if(length<2) return 0;
        int[] buy = new int[length];
        int[] sell = new int[length];
        buy[0]=-prices[0];
        buy[1]=Math.max(-prices[0],-prices[1]);
        sell[0]=0;
        sell[1] = Math.max(0,prices[1]-prices[0]);
        for(int i=2;i<length;i++){
            sell[i] = Math.max(buy[i-1]+prices[i],sell[i-1]);
            buy[i] = Math.max(sell[i-2]-prices[i],buy[i-1]);
        }
        return sell[length-1];
    }
}