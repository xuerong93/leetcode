public class Solution {
    public int reverse(int n) {
        StringBuilder sb = new StringBuilder();
        if(n==0) return 0;
        boolean bol = (n<0);
        n=Math.abs(n);
        while(n%10==0){
            n/=10;
        }
        while(n>0){
            sb.append(n%10);
            n/=10;
        }
        String str = sb.toString();
        long res = Long.valueOf(str);
        if(bol) res=res*(-1);
        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE) return 0;
        return (int) res;
    }
}