public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int m = primes.length;
        int[] factors = new int[m];
        for(int i=0;i<m;i++){
            factors[i] = primes[i];
        }
        int[] index = new int[m];
        int[] res = new int[n];
        res[0] = 1;
        
        for(int i = 1;i<n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
                min = Math.min(min,primes[j]);
            }
            res[i] = min;
            for(int j = 0;j<m;j++){
                if(min == primes[j]){
                    primes[j] = res[++index[j]] * factors[j];
                }
            }
        }
        return res[n-1];
    }
}