public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0) return res;
        Arrays.sort(nums);
        List<Integer> item=new ArrayList<Integer>();
        boolean[] visited = new boolean[nums.length];
       // HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        permuteUnique(res,item,nums,0,visited);
        return res;
    }
    public void permuteUnique( List<List<Integer>> res, List<Integer> item,int[] nums,int index, boolean[] visited){
        if(index==nums.length){
            List<Integer> temp = new ArrayList<Integer>(item);
            res.add(temp);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i] || (i>0 && nums[i]==nums[i-1] && !visited[i-1]) continue;
            item.add(nums[i]);
            visited[i]=true;
            permuteUnique(res,item,nums,index+1,visited);
            visited[i]=false;
            item.remove(item.size()-1);
        }
    }
}