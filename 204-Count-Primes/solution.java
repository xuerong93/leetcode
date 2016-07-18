public class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(0,2);
        for(int i=2;i<n;i++){
            int j=0;
            for(;j<map.size();j++){
                if(i%map.get(j)==0) break;
            }
            if(j==map.size()) map.put(map.size(),i);
        }
        return map.size();
    }
}