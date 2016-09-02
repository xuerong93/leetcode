public class Solution {
    public int reverse(int n) {
        long temp=0;
        while(n!=0){
            temp = temp*10+n%10;
            n/=10;
        }

        if(temp>Integer.MAX_VALUE || temp<Integer.MIN_VALUE) return 0;
        return (int) temp;
    }
}