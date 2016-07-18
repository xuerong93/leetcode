public class Solution {
    public int countPrimes(int n) {
        int[] res=new int[n];//default is false
        for(int i=2;i<n;i++){
            res[i]=1;   //1 means true, 0 means false
        }
        for(int i=2;i*i<n;i++){
            if(res[i]==0) continue;
            for(int j=i*i;j<n;j+=i){
                res[j]=0;
            }
            
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(res[i]==1) count++;
        }
        return count;
    }
}