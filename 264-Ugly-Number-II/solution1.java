public class Solution {
    public int nthUglyNumber(int n) {
        int[] primes = {2,3,5};
        int[] factors = {2,3,5};
        int m = primes.length;
        int[] index = new int[m];
        int[] res  = new int[n];
        res[0]=1;
        
        for(int i=1;i<n;i++){
            int min = Integer.MAX_VALUE;
            for(int j =0;j<m;j++){
                min = Math.min(min,primes[j]);
            }
            res[i] = min;
            for(int j=0;j<m;j++){
               if(min == primes[j]) primes[j] = factors[j] * res[++index[j]]; 
            }
            
        }
        return res[n-1];
    }
}