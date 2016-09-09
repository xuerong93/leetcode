public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        while(set.add(n)){
            n = calculate(n);
        }
        return n==1? true: false;
    }
    public int calculate(int n){
        int res = 0;
        while(n!=0){
            res += (n%10) *(n%10);
            n=n/10;
        }
        return res;
    }
    
}