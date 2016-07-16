public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }else{
                maxprofit=Math.max(maxprofit,prices[i]-minPrice);
            }
            
        }
        return maxprofit;
    }
}