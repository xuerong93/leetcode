public class Solution {
    public int findNthDigit(int n) {
        //k means the number digits of a number
        int k = 1;
        //num means the count of numbers with the same digits
        long num = 9;
        //start means the start level, two digits, or three digits
        int start = 1;
        while(n > k*num){
            n -= k*num;
            k++;
            num *=10;
            start *=10;
        }
        
        //now n is the part more than the start
        start += --n/k;
        return Integer.toString(start).charAt(n%k)-'0';
    }
}