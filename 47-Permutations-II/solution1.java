public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0) return res;
        Arrays.sort(nums);
        List<Integer> item=new ArrayList<Integer>();
        //use visited array to store state of visited or not, in order to remove duplicates
        boolean[] visited = new boolean[nums.length];
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
            // if the num has been used, skip it(but still can use the next one which is the same with the current number); if the num is the same as the previous one, skip it
            if(visited[i] || (i>0 && nums[i]==nums[i-1] && !visited[i-1])) continue;
            item.add(nums[i]);
            visited[i]=true;
            permuteUnique(res,item,nums,index+1,visited);
            // to restore the previous state
            visited[i]=false;
            item.remove(item.size()-1);
        }
    }
}