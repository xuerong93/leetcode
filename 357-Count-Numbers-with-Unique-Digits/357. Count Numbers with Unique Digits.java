public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        if(n==1) return 10;
        n=Math.min(n,10);
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=9;
        int res=dp[0]+dp[1];
        int k=dp[0]*dp[1];
        for(int i=2;i<=n;i++){
            dp[i]=9-i+2;
            k*=dp[i];
            res+=k;
        }
    
        return res;
    }
}