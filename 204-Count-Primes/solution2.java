public class Solution {
    public int countPrimes(int n) {
        if(n<3) return 0;
        int[] res=new int[n];
        res[2]=1;
        for(int i=3;i<n;i+=2){
            res[i]=1;
        }
        for(int i=3;i*i<n;i+=2){
            if(res[i]==0) continue;
            for(int j=i*i;j<n;j+=2*i){//they are all not prime
                res[j]=0;
            }
        }
        int count=0;
        for(int i=1;i<n;i+=2){
            if(res[i]==1) count++;
        }
        return count+1;//1 is for prime 2
    }
}