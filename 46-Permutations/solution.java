public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0) return res;
        List<Integer> item = new ArrayList<Integer>();
        permute(nums,res,item,0);
        return res;
    }
    public void permute(int[] nums,List<List<Integer>> res,List<Integer> item,int index){
        if(index==nums.length){
            List<Integer> temp = new ArrayList<Integer>(item);
            res.add(temp);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(item.contains(nums[i])) continue;
            item.add(nums[i]);
            permute(nums,res,item,index+1);
            item.remove(item.size()-1);
        }
    }
}