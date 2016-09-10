public class Solution {
    
    public boolean isHappy(int n) {
        HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
        map.put(1,true);
        if(map.containsKey(n)){
            return map.get(n);
        }
        map.put(n,false);
        boolean res = isHappy(transform(n));
        map.put(n,res);
        return res;
    }
    public int transform(int n){
        int res = 0;
        while(n!=0){
            res+=(n%10)*(n%10);
            n=n/10;
        }
        return res;
    }
}