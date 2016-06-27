public class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0) return false;
        long i=1;
        while(num>0){
            num-=i;
            i+=2;
        }
        return num==0;
    }
}