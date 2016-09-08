public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        int count = 32;
        while(count>0){
            int bit = n & (0x1); 
            res = (res<<1)|bit;
            n = (n >>> 1);
            count--;
        }
        return res;
    }
}