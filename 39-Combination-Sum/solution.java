public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(candidates==null || candidates.length==0) return res;
        Arrays.sort(candidates);
        List<Integer> item=new ArrayList<Integer>();
        combinationSum(candidates,target,item,0,res);
        return res;
    }
    public void combinationSum(int[] candidates, int target, List<Integer> item, int index,List<List<Integer>> res){
        if(target==0){
            List<Integer> temp = new ArrayList<Integer>(item);
            res.add(temp);
            return;
        }
        
        for(int i=index;i<candidates.length;i++){
            if(target<candidates[i]) return;
            if(i+1<candidates.length && candidates[i]==candidates[i+1]) continue;
            item.add(candidates[i]);
            combinationSum(candidates,target-candidates[i],item,i,res);
            item.remove(item.size()-1);
        }
    }
}