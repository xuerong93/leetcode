public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res=new ArrayList<Integer>();
        if(n<0) return res;
        res.add(0);
        
        for(int i=0;i<n;i++){
            int temp=1<<i;
            int size=res.size();
            for(int j=size-1;j>=0;j--){
                res.add(temp+res.get(j));
            }
        }
        return res;
    }
}