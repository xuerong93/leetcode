public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<Integer>();
        set.add(n);
        while(n!=1){
            int sum=0;
            while(n!=0){
                sum+=(int)(Math.pow((double)n%10, 2.0));
                n=n/10;
            }
            n=sum;
            if(set.contains(sum)) return false;
            else set.add(sum);
        }
        return true;
    }
}