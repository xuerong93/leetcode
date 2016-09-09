public class Solution {
    public int nthUglyNumber(int n) {
        int index2 = 1;
        int index3 = 1;
        int index5 = 1;
        int[] res  = new int[n];
        int[] factor = {2,3,5};
        res[0]=1;
        int min = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            min = Math.min(Math.min(factor[0],factor[1]),factor[2]);
            res[i] = min;
            if(min== factor[0]) factor[0] = 2 * res[index2++];
            if(min== factor[1]) factor[1] = 3 * res[index3++];
            if(min== factor[2]) factor[2] = 5 * res[index5++];
        }
        return res[n-1];
    }
}