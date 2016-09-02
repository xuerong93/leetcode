public class Solution {
    public int reverse(int n) {
        if(n==0) return 0;
        boolean bol = (n<0);
        n=Math.abs(n);
        int reversed_n = 0;
        while(n>0){
            int temp = reversed_n ;
            reversed_n = temp*10+n%10;
            if(reversed_n/10 != temp){
                reversed_n = 0;
                break;
            }
            n/=10;
        }
        if(bol) reversed_n = reversed_n*(-1);

        return reversed_n;
    }
}