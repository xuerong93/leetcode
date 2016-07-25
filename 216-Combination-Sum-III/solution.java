public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res =new ArrayList<List<Integer>> ();
        if(k<=0 || n<0) return res;
        List<Integer> item = new ArrayList<Integer>();
        combinationSum3(res,item,1,n,k);
        return res;
    }
    public void combinationSum3(List<List<Integer>> res,List<Integer> item, int index,int n,int k){
        if(n==0 && k==0){
            List<Integer> temp = new ArrayList<Integer>(item);
            res.add(temp);
            return;
        }
        if(k<=0) return;
        for(int i=index;i<=9;i++){
            if(n<i) return;
            item.add(i);
            combinationSum3(res,item,i+1,n-i,k-1);
            item.remove(item.size()-1);
        }
        
    }
}