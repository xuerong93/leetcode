public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        //add the next element to anywhere of the existing result
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0) return res;
        res.add(new ArrayList<Integer>());
        for(int i=0;i<nums.length;i++){
            List<List<Integer>> cur=new ArrayList<List<Integer>>();
            for(List<Integer> l:res){
                for(int j=0;j<=l.size();j++){
                    l.add(j,nums[i]);
                    List<Integer> temp = new ArrayList<Integer>(l);
                    cur.add(temp);
                    l.remove(j);
                }
            }
            res=new ArrayList<List<Integer>>(cur);
        }
        return res;
    }
}