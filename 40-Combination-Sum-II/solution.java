public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<List<Integer>>();
        if(candidates==null || candidates.length==0) return;
        Arrays.sort(candidates);
        List<Integer> item = new ArrayList<Integer>();
        combinationSum2(candidates,target,0,res,item);
        return res;
    }
    public void combinationSum2(int[] candidates, int target, int index, List<List<Integer>> res, List<Integer> item){
        if(target==0){
            List<Integer> temp = new ArrayList<Integer>();
            res.add(temp);
            return;
        }
        
        for(int i=index;i<candidates.length;i++){
            if(target<candidates[i]) return;
            item.add(candidates[i]);
            combinationSum2(candidates,target-candidates[i],i+1, res,item);
            item.remove(item.size()-1);
        }
    }
}