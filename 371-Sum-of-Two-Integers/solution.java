public class Solution {
    public int getSum(int a, int b) {
        int carry = b;
        while(carry!=0){
            int sum = a^b;
            carry =(a&carry)<<1;
        }
        return sum;
    }
}