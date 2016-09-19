public class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int c = a;
            a = c^b;
            b = (c&b)<<1;
        }
        return a;
    }
}