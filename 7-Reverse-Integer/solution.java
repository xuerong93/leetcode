public class Solution {
    public int reverse(int n) {
        if(n==0) return 0;
        boolean bol = (n<0);
        n=Math.abs(n);
        long temp=0;
        while(n>0){
            temp = temp*10+n%10;
            n/=10;
        }
        if(bol) res=res*(-1);
        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE) return 0;
        return (int) res;
    }
}