public class Solution {
    public int maxProfit(int[] prices) {
        //for each i, calculate the max profit on its left and max profit on its right
        if(prices == null || prices.length < 2) return 0;
        int length = prices.length;
        
        int[] left = new int[length];
        int[] right = new int[length];
        int profit = 0;
        
        //dp from left , to calculate the max profit on i's left
        int left_min = prices[0];
        left[0] = 0;
        for(int i = 1; i<length; i++){
            left_min = Math.min(left_min,prices[i]);
            left[i] = Math.max(left[i-1], prices[i] - left_min);
        }
        
        //dp from right, to calculate the max profit on i's right
        int right_max = prices[length-1];
        right[length-1] = 0;
        for(int i = length-2; i >= 0; i--){
            right_max = Math.max(right_max,prices[i]);
            right[i] = Math.max(right[i+1], right_max - prices[i]);
        }
        
        //calculate the total max profit
        for(int i=0; i<length ; i++ ){
            profit = Math.max(profit, left[i]+right[i]);
        }
        
        return profit;
    }
}