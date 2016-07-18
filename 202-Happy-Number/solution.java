public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<Integer>();
        set.add(n);
        while(n!=1){
            int sum=0;
            while(n!=0){
                int remain = n%10;
                sum+=remain * remain;
                n=n/10;
            }
            n=sum;
            if(!set.add(sum)) return false;
           
        }
        return true;
    }
}